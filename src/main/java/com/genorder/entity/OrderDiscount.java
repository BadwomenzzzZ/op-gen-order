package com.genorder.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 订单优惠详情表
 * </p>
 *
 * @author ChenJ
 * @since 2023-07-31
 */
@TableName("t_order_discount")
public class OrderDiscount implements Serializable {

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
     * 订单商品明细id
     */
    private String orderItemId;

    /**
     * 优惠金额
     */
    private BigDecimal discountPrice;

    /**
     * 优惠id
     */
    private String discountId;

    /**
     * 优惠活动描述
     */
    private String discountDesc;

    /**
     * 优惠类型
     */
    private String couponType;

    /**
     * 计算步骤
     */
    private Integer calcStep;

    /**
     * 计算表达式，实际支付金额的计算表达式
     */
    private String calcExpression;

    /**
     * 创建日期
     */
    private LocalDateTime createTime;

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

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getDiscountId() {
        return discountId;
    }

    public void setDiscountId(String discountId) {
        this.discountId = discountId;
    }

    public String getDiscountDesc() {
        return discountDesc;
    }

    public void setDiscountDesc(String discountDesc) {
        this.discountDesc = discountDesc;
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public Integer getCalcStep() {
        return calcStep;
    }

    public void setCalcStep(Integer calcStep) {
        this.calcStep = calcStep;
    }

    public String getCalcExpression() {
        return calcExpression;
    }

    public void setCalcExpression(String calcExpression) {
        this.calcExpression = calcExpression;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "OrderDiscount{" +
            "id = " + id +
            ", orderSn = " + orderSn +
            ", orderItemId = " + orderItemId +
            ", discountPrice = " + discountPrice +
            ", discountId = " + discountId +
            ", discountDesc = " + discountDesc +
            ", couponType = " + couponType +
            ", calcStep = " + calcStep +
            ", calcExpression = " + calcExpression +
            ", createTime = " + createTime +
        "}";
    }
}
