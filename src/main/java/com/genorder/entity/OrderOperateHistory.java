package com.genorder.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 订单操作历史记录表
 * </p>
 *
 * @author ChenJ
 * @since 2023-07-31
 */
@TableName("t_order_operate_history")
public class OrderOperateHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 订单号
     */
    private String orderSn;

    /**
     * 操作时间
     */
    private LocalDateTime operateTime;

    /**
     * 操作类型
     */
    private String operateType;

    /**
     * 操作人
     */
    private String operator;

    /**
     * 操作详情 remark
     */
    private String details;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public LocalDateTime getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(LocalDateTime operateTime) {
        this.operateTime = operateTime;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "OrderOperateHistory{" +
            "id = " + id +
            ", orderSn = " + orderSn +
            ", operateTime = " + operateTime +
            ", operateType = " + operateType +
            ", operator = " + operator +
            ", details = " + details +
        "}";
    }
}
