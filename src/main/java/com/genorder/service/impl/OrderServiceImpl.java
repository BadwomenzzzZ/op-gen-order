package com.genorder.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.genorder.config.BizException;
import com.genorder.config.Constant;
import com.genorder.dto.*;
import com.genorder.entity.*;
import com.genorder.feign.UserFeign;
import com.genorder.mapper.*;
import com.genorder.pojo.OrderSearchPOJO;
import com.genorder.service.IOrderService;
import com.genorder.utils.ArithUtil;
import com.genorder.utils.ArraySplitter;
import com.genorder.utils.DateUtil;
import com.genorder.utils.SnGenUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author ChenJ
 * @since 2023-07-31
 */
@Service
@Slf4j
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

    @Autowired
    private MachineShelfMapper machineShelfMapper;

    @Autowired
    private AccountStoreMapper accountStoreMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderItemsMapper orderItemsMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private MachineMapper machineMapper;

    @Autowired
    private DeliversOrderMapper deliversOrderMapper;

    @Autowired
    private VirtualLogMapper virtualOrderMapper;

    @Autowired
    private UserFeign userFeign;


    @Override
    public List<DeliverDTO> listDeliver(String kw) {
        List<DeliverDTO>  list  = machineShelfMapper.listDeliver(kw);
        if (CollectionUtils.isEmpty(list)) {
            return new ArrayList<>();
        }
        return list;
    }

    @Override
    public List<GoodsDTO> listGoods(String deliverId) {
        List<GoodsDTO> list = machineShelfMapper.listGoods(deliverId);
        if (CollectionUtils.isEmpty(list)) {
            return new ArrayList<>();
        }
        return list;
    }

    @Override
    public List<MemberDTO> listMember() {
        List<MemberDTO> list = accountStoreMapper.listMember();
        if (CollectionUtils.isEmpty(list)) {
            return new ArrayList<>();
        }
        return list;
    }

    @Override
    @Transactional
    public void addOrder(OrderAddDTO dto) {
        synchronized(this){
            MachineShelf machineShelf = machineShelfMapper.selectById(dto.getMsId());
            if (machineShelf == null) {
                throw new BizException("查无此商品");
            }
            if (machineShelf.getStock().intValue() < dto.getTotalNum().intValue()) {
                throw new BizException("购买数量不能大于库存数量");
            }
            QueryWrapper<Machine> var1 = new QueryWrapper<>();
            var1.eq("machine_id", machineShelf.getMachineId());
            Machine machine = machineMapper.selectOne(var1);
            if (machine == null) {
                throw new BizException("查无此设备");
            }
            Goods goods = new Goods();
            if (StringUtils.isNotBlank(machineShelf.getGoodsId())) {
                QueryWrapper<Goods> var2 = new QueryWrapper<>();
                var2.eq("goods_id", machineShelf.getGoodsId());
                goods = goodsMapper.selectOne(var2);
            }
            QueryWrapper<AccountStore> var3 = new QueryWrapper<>();
            var3.eq("account_id", dto.getAccountId());
            AccountStore accountStore = accountStoreMapper.selectOne(var3);
            if (accountStore == null) {
                throw new BizException("查无此用户");
            }
            Order order = orderMapper.getLastOrderByMachId(machineShelf.getMachineId());
            String orderSn = null;
            String deliversSn = null;
            String thirdTransId = SnGenUtil.transNumber();
            Byte payStatus = 1;
            Byte deliveryStatus = 0;
            Byte shipStatus = 1; //出货状态
            Byte deliveryType  = 1; //出货类型
            Double poundage = 0.006;
            String clientSource = "miniProgram";
            if (order == null) {
                orderSn = SnGenUtil.generateOrderNumber();
                deliversSn = SnGenUtil.generateDeliversNumber();
            } else {
                orderSn = SnGenUtil.generateOrderNumber(order.getOrderSn());
                deliversSn = SnGenUtil.generateDeliversNumber(order.getDeliversSn());
            }
            log.info("orderSn : {}",orderSn);
            //add t_order
            Order insertOrder = Order.builder()
                    .orderSn(orderSn)
                    .deliversSn(deliversSn)
                    .thirdTransId(thirdTransId)
                    .orderPrice(machineShelf.getPrice())
                    .payPrice(machineShelf.getPrice())
                    .payType(dto.getPayType())
                    .payTime(LocalDateTime.now())
                    .orderStatus(dto.getOrderState().byteValue())
                    .payStatus(payStatus)
                    .clientSource(clientSource)
                    .appId(accountStore.getMpAppid())
                    .mchId(accountStore.getMchId())
                    .machineId(machineShelf.getMachineId())
                    .machineName(machine.getMachineName())
                    .machineType(machine.getMachineType().toString())
                    .deliveryMode(dto.getDeliveryMode())
                    .poundage(BigDecimal.valueOf(poundage))
                    .poundageAmount(BigDecimal.valueOf(ArithUtil.mul(machineShelf.getPrice().doubleValue(), poundage)))
                    .areaNo(machine.getAreaNo())
                    .tenantId(machine.getTenantId())
                    .accountId(dto.getAccountId())
                    .version(1)
                    .lastUpdateTime(LocalDateTime.now().minusMinutes(10))
                    .machineShelves(machineShelf.getShelfIndex().toString())
                    .build();
            if (dto.getDeliveryTime() != null) {
                Instant instant = dto.getDeliveryTime().toInstant();
                insertOrder.setCreateTime(instant.atZone(ZoneId.systemDefault()).toLocalDateTime());
            }
            log.info("order : {}" , insertOrder);
            orderMapper.insert(insertOrder);
            //add t_order_items
            OrderItems orderItems = OrderItems.builder()
                    .orderSn(orderSn)
                    .goodsId(machineShelf.getGoodsId())
                    .goodsName(StringUtils.isBlank(machineShelf.getGoodsId()) ? "商品".concat(machineShelf.getShelfIndex().toString()) : goods.getGoodsName())
                    .shelfIndex(machineShelf.getShelfIndex())
                    .salePrice(machineShelf.getPrice())
                    .unitPrice(machineShelf.getPrice())
                    .saleTotalAmount(BigDecimal.valueOf(ArithUtil.mul(dto.getTotalNum(), machineShelf.getPrice().doubleValue())))
                    .totalPrice(BigDecimal.valueOf(ArithUtil.mul(dto.getTotalNum(), machineShelf.getPrice().doubleValue())))
                    .totalNum(dto.getTotalNum())
                    .deliveryNum(dto.getTotalNum())
                    .deliveryStatus(deliveryStatus)
                    .createTime(LocalDateTime.now().minusMinutes(10))
                    .lastUpdateTime(LocalDateTime.now().minusMinutes(10))
                    .version(1)
                    .build();
            if (dto.getDeliveryTime() != null) {
                Instant instant = dto.getDeliveryTime().toInstant();
                orderItems.setDeliveryTime(instant.atZone(ZoneId.systemDefault()).toLocalDateTime());
            }
            log.info("orderItems : {}", orderItems);
            orderItemsMapper.insert(orderItems);
            //add t_delivers_order
            DeliversOrder deliversOrder = DeliversOrder.builder()
                    .machineId(machineShelf.getMachineId())
                    .machineName(machine.getMachineName())
                    .shelfIndex(machineShelf.getShelfIndex())
                    .status(shipStatus)
                    .price(machineShelf.getPrice())
                    .tenantId(machine.getTenantId())
                    .accountId(dto.getAccountId())
                    .orderSn(orderSn)
                    .deliversSn(deliversSn)
                    .deliveryType(deliveryType)
                    .createTime(LocalDateTime.now().minusMinutes(8))
                    .goodsId(machineShelf.getGoodsId())
                    .goodsName(StringUtils.isBlank(machineShelf.getGoodsId()) ? "商品".concat(machineShelf.getShelfIndex().toString()) : goods.getGoodsName())
                    .totalQty(dto.getTotalNum())
                    .quantity(dto.getTotalNum())
                    .build();
            if (dto.getDeliveryTime() != null) {
                Instant instant = dto.getDeliveryTime().toInstant();
                deliversOrder.setCreateTime(instant.atZone(ZoneId.systemDefault()).toLocalDateTime());
            }
            log.info("deliversOrder : {}" , deliversOrder);
            deliversOrderMapper.insert(deliversOrder);
            //add t_virtual_log
            VirtualLog virtualOrder = VirtualLog.builder()
                    .createTime(LocalDateTime.now())
                    .orderSn(orderSn)
                    .build();
            virtualOrderMapper.insert(virtualOrder);
            log.info("virtualOrder : {}" , virtualOrder);
        }
    }

    @Override
    @Transactional
    public void addOrder(NewOrderAddDTO dto) {
        List<String> machineIds = dto.getMachineIds();
        Integer alipayScale = dto.getAlipayScale(); //3
        Integer wxScale = dto.getWxScale(); //1
        double splitRatio = 0;
        splitRatio = (double) wxScale /(alipayScale+wxScale);
        List<String>[] lists = ArraySplitter.splitArray(machineIds, splitRatio);
        List<String> wxArr = lists[0];
        List<String> aliArr = lists[1];
        //微信
        if (!CollectionUtils.isEmpty(wxArr)) {
            for (String machineId : wxArr) {
                OrderAddDTO orderAddDTO = new OrderAddDTO();
                orderAddDTO.setAccountId(dto.getAccountId());
                orderAddDTO.setDeliveryTime(DateUtil.randomDateBetweenTwoDates(dto.getBTime(), dto.getETime()));
                orderAddDTO.setPayType(1);
                //随机该设备下的货道
                String msId = machineShelfMapper.getRandomMs(machineId);
                if (StringUtils.isBlank(msId)) {
                    throw new BizException("设备"+machineId+"无商品");
                }
                orderAddDTO.setMsId(msId);
                addOrder(orderAddDTO);
                System.out.println(orderAddDTO);
            }
        }
        //支付宝
        if (!CollectionUtils.isEmpty(aliArr)) {
            for (String machineId : aliArr) {
                OrderAddDTO orderAddDTO = new OrderAddDTO();
                orderAddDTO.setAccountId(dto.getAccountId());
                orderAddDTO.setDeliveryTime(DateUtil.randomDateBetweenTwoDates(dto.getBTime(), dto.getETime()));
                orderAddDTO.setPayType(2);
                //随机该设备下的货道
                String msId = machineShelfMapper.getRandomMs(machineId);
                if (StringUtils.isBlank(msId)) {
                    throw new BizException("设备"+machineId+"无商品");
                }
                orderAddDTO.setMsId(msId);
                System.out.println(orderAddDTO);
                addOrder(orderAddDTO);
            }
        }

    }

    @Override
    public Map listOrder(String token , Integer pageNumber, Integer pageSize , OrderSearchPOJO pojo , Date beginTime , Date endTime) {
        JSONObject rep = userFeign.getInfo(token);
        String code = rep.getString("code");
        if (!"200".equals(code)) {
            Map<String, Object> map = new HashMap<>();
            map.put("code", Integer.valueOf(code));
            map.put("msg", "服务错误");
            return map;
        }
        JSONArray roles = rep.getJSONArray("roles");
        if (CollectionUtils.isEmpty(roles)) {
            return null;
        }
        String roleCode = (String) roles.get(0);
        if (Constant.ALL_ORDER_ROLE.equals(roleCode)) {
            Integer firstIndex = (pageNumber - 1) * pageSize;
            Integer lastIndex = pageNumber * pageSize;
            List<Order> list = orderMapper.listOrder(firstIndex, lastIndex , pojo , beginTime , endTime);
            Integer totalNum = orderMapper.countOrders(pojo , beginTime , endTime);
            Map<String, Object> map = new HashMap<>();
            map.put("data", list);
            map.put("code", 200);
            map.put("error", false);
            map.put("nsg", "查询成功");
            map.put("success", true);
            map.put("total", totalNum);
            return map;
        }
        return null;
    }
}
