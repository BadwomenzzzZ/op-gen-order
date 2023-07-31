package com.genorder.service.impl;

import com.genorder.dto.DeliverDTO;
import com.genorder.dto.MachineShelfDTO;
import com.genorder.entity.Order;
import com.genorder.mapper.MachineShelfMapper;
import com.genorder.mapper.OrderMapper;
import com.genorder.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author ChenJ
 * @since 2023-07-31
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

    @Autowired
    private MachineShelfMapper machineShelfMapper;

    @Override
    public List<DeliverDTO> listDeliver() {
        List<DeliverDTO>  list  = machineShelfMapper.listDeliver();
        if (CollectionUtils.isEmpty(list)) {
            return new ArrayList<>();
        }
        return list;
    }

    @Override
    public List<MachineShelfDTO> listGoods(Long deliverId) {
        List<MachineShelfDTO> list = machineShelfMapper.listGoods(deliverId);
        if (CollectionUtils.isEmpty(list)) {
            return new ArrayList<>();
        }
        return list;
    }
}
