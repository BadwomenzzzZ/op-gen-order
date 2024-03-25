package com.genorder.controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.genorder.config.BaseResponse;
import com.genorder.dto.*;
import com.genorder.pojo.OrderSearchPOJO;
import com.genorder.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @PostMapping("/add")
    public BaseResponse addOrder(@RequestBody OrderAddDTO dto){
        if (dto.getTotalNum() == null || dto.getTotalNum() <= 0 || dto.getPayType() == null || dto.getOrderState() == null
                || StringUtils.isBlank(dto.getAccountId()) || StringUtils.isBlank(dto.getDeliveryMode()) ||
                StringUtils.isBlank(dto.getMsId())) {
            return BaseResponse.error("请正确传递参数");
        }
        orderService.addOrder(dto);
        return BaseResponse.success();
    }

    @PostMapping("/addNew")
    public BaseResponse addNew(@RequestBody NewOrderAddDTO dto){
        if (CollectionUtils.isEmpty(dto.getMachineIds()) || dto.getBTime() == null || dto.getETime() == null || StringUtils.isBlank(dto.getAccountId())
                || dto.getWxScale() == null || dto.getAlipayScale() == null) {
            return BaseResponse.error("请正确传递参数");
        }
        orderService.addOrder(dto);
        return BaseResponse.success();
    }


    @PostMapping("/addNew_v2")
    public BaseResponse addNewV2(@RequestBody NewOrderAddDTO dto){
        if (CollectionUtils.isEmpty(dto.getMachineIds()) || StrUtil.isEmpty(dto.getBTimeStr()) || StrUtil.isEmpty(dto.getETimeStr()) || StringUtils.isBlank(dto.getAccountId())
                || dto.getWxScale() == null || dto.getAlipayScale() == null || dto.getMaxOrderNum() == null || dto.getMinOrderNum() == null || dto.getTotalOrderNum() == null
                || dto.getMaxOrderNum().intValue() < dto.getMinOrderNum().intValue()) {
            return BaseResponse.error("请正确传递参数");
        }
        dto.setBTime(DateUtil.parse(dto.getBTimeStr(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        dto.setETime(DateUtil.parse(dto.getETimeStr(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        orderService.addNewV2(dto);
        return BaseResponse.success();
    }



    @RequestMapping("/listDeliver")
    public BaseResponse listDeliver(String kw) {
        List<DeliverDTO> list = orderService.listDeliver(kw);
        return BaseResponse.success(list);
    }

    @RequestMapping("/listGoods")
    public BaseResponse listGoods(String deliverId) {
        if (deliverId == null) {
            return BaseResponse.error();
        }
        List<GoodsDTO> list = orderService.listGoods(deliverId);
        return BaseResponse.success(list);
    }

    @RequestMapping("/listMember")
    public BaseResponse listMember() {
        List<MemberDTO> list = orderService.listMember();
        return BaseResponse.success(list);
    }

    @RequestMapping("/list")
    public Object listOrder(@RequestHeader(value = "Authorization" ,required = false) String token , Integer pageNum , Integer pageSize
                             , OrderSearchPOJO pojo ,
                            @RequestParam(value = "params[beginTime]" , required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date beginTime ,
                            @RequestParam(value = "params[endTime]" , required = false)   @DateTimeFormat(pattern = "yyyy-MM-dd") Date endTime) {
        if (pageNum == null || pageSize == null) {
            return BaseResponse.error();
        }
        if (StringUtils.isBlank(token)) {
            Map<String, Object> map = new HashMap<>();
            map.put("code", 401);
            map.put("msg", "令牌不能为空");
            return map;
        }
        Map map = orderService.listOrder(token , pageNum , pageSize , pojo , beginTime , endTime);
        return map;
    }


}
