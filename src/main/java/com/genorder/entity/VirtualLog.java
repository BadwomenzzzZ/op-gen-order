package com.genorder.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author ChenJ
 * @since 2023-08-01
 */
@TableName("t_virtual_log")
@Builder
public class VirtualLog implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private LocalDateTime createTime;

    /**
     * 订单编号
     */
    private String orderSn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    @Override
    public String toString() {
        return "VirtualOrder{" +
            "id = " + id +
            ", createTime = " + createTime +
            ", orderSn = " + orderSn +
        "}";
    }
}
