package com.genorder.service.impl;

import com.genorder.entity.OrderRefunds;
import com.genorder.mapper.OrderRefundsMapper;
import com.genorder.service.IOrderRefundsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单退款详情表 服务实现类
 * </p>
 *
 * @author ChenJ
 * @since 2023-07-31
 */
@Service
public class OrderRefundsServiceImpl extends ServiceImpl<OrderRefundsMapper, OrderRefunds> implements IOrderRefundsService {

}
