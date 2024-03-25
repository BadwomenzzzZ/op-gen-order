package com.genorder.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.genorder.dto.*;
import com.genorder.entity.Order;
import com.baomidou.mybatisplus.extension.service.IService;
import com.genorder.pojo.OrderSearchPOJO;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 订单表 服务类
 * </p>
 *
 * @author ChenJ
 * @since 2023-07-31
 */
public interface IOrderService extends IService<Order> {

    List<DeliverDTO> listDeliver(String kw);

    List<GoodsDTO> listGoods(String deliverId);

    List<MemberDTO> listMember();


    void addOrder(OrderAddDTO dto);

    void addOrder(NewOrderAddDTO dto);

    Map listOrder(String token , Integer pageNumber, Integer pageSize , OrderSearchPOJO pojo , Date beginTime , Date endTime);

    void addNewV2(NewOrderAddDTO dto);
}
