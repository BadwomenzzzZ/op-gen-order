package com.genorder.service;

import com.genorder.dto.*;
import com.genorder.entity.Order;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 订单表 服务类
 * </p>
 *
 * @author ChenJ
 * @since 2023-07-31
 */
public interface IOrderService extends IService<Order> {

    List<DeliverDTO> listDeliver();

    List<GoodsDTO> listGoods(Long deliverId);

    List<MemberDTO> listMember();


    void addOrder(OrderAddDTO dto);

    List<Order> listOrder(String token);
}
