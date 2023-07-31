package com.genorder.service.impl;

import com.genorder.entity.OrderDiscount;
import com.genorder.mapper.OrderDiscountMapper;
import com.genorder.service.IOrderDiscountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单优惠详情表 服务实现类
 * </p>
 *
 * @author ChenJ
 * @since 2023-07-31
 */
@Service
public class OrderDiscountServiceImpl extends ServiceImpl<OrderDiscountMapper, OrderDiscount> implements IOrderDiscountService {

}
