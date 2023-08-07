package com.genorder.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

    List<GoodsDTO> listGoods(String deliverId);

    List<MemberDTO> listMember();


    void addOrder(OrderAddDTO dto);

    Page<Order> listOrder(String token , Integer pageNumber, Integer pageSize);
}
