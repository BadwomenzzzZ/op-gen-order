package com.genorder.service.impl;

import com.genorder.entity.Order;
import com.genorder.mapper.OrderMapper;
import com.genorder.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
