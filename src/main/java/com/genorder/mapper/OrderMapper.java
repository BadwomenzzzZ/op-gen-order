package com.genorder.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.genorder.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 订单表 Mapper 接口
 * </p>
 *
 * @author ChenJ
 * @since 2023-07-31
 */
public interface OrderMapper extends BaseMapper<Order> {

    Order getLastOrderByMachId(@Param("machineId") String machineId);

    Page<Order> listOrder(@Param("page") Page<Order> page);
}
