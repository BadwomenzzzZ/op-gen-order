package com.genorder.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 订单退款详情表
 * </p>
 *
 * @author ChenJ
 * @since 2023-07-31
 */
@TableName("t_order_refunds")
public class OrderRefunds implements Serializable {

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
     * 退款单号
     */
    private String refundSn;

    /**
     * 第三方退款单号
     */
    private String refundOutTransId;

    /**
     * 退款金额
     */
    private BigDecimal refundAmount;

    /**
     * 退款商品数量
     */
    private Integer refundNum;

    /**
     * 申请退款时间
     */
    private LocalDateTime createTime;

    /**
     * 退款完成时间
     */
    private LocalDateTime refundedTime;

    /**
     * 退款状态
     */
    private String refundStatus;

    /**
     * 退款来源
     */
    private String refundSource;

    /**
     * 操作人, 系统自动退款为：system
     */
    private String operator;

    /**
     * 最后更新时间
     */
    private LocalDateTime lastUpdateTime;

    /**
     * 乐观锁版本号
     */
    private Integer version;

    /**
     * 租户id
     */
    private Long tenantId;

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

    public String getRefundSn() {
        return refundSn;
    }

    public void setRefundSn(String refundSn) {
        this.refundSn = refundSn;
    }

    public String getRefundOutTransId() {
        return refundOutTransId;
    }

    public void setRefundOutTransId(String refundOutTransId) {
        this.refundOutTransId = refundOutTransId;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Integer getRefundNum() {
        return refundNum;
    }

    public void setRefundNum(Integer refundNum) {
        this.refundNum = refundNum;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getRefundedTime() {
        return refundedTime;
    }

    public void setRefundedTime(LocalDateTime refundedTime) {
        this.refundedTime = refundedTime;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getRefundSource() {
        return refundSource;
    }

    public void setRefundSource(String refundSource) {
        this.refundSource = refundSource;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public LocalDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(LocalDateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public String toString() {
        return "OrderRefunds{" +
            "id = " + id +
            ", orderSn = " + orderSn +
            ", orderItemId = " + orderItemId +
            ", refundSn = " + refundSn +
            ", refundOutTransId = " + refundOutTransId +
            ", refundAmount = " + refundAmount +
            ", refundNum = " + refundNum +
            ", createTime = " + createTime +
            ", refundedTime = " + refundedTime +
            ", refundStatus = " + refundStatus +
            ", refundSource = " + refundSource +
            ", operator = " + operator +
            ", lastUpdateTime = " + lastUpdateTime +
            ", version = " + version +
            ", tenantId = " + tenantId +
        "}";
    }
}
