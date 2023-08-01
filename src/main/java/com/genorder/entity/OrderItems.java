package com.genorder.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 订单货物表
 * </p>
 *
 * @author ChenJ
 * @since 2023-07-31
 */
@TableName("t_order_items")
@Builder
public class OrderItems implements Serializable {

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
     * 商品id
     */
    private String goodsId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 设备货道号
     */
    private Integer shelfIndex;

    /**
     * 商品(标价)单价
     */
    private BigDecimal salePrice;

    /**
     * 商品(实际,优惠后)单价
     */
    private BigDecimal unitPrice;

    /**
     * 商品(标价,)总价
     */
    private BigDecimal saleTotalAmount;

    /**
     * (实际,优惠后)商品总价
     */
    private BigDecimal totalPrice;

    /**
     * 商品数量
     */
    private Integer totalNum;

    /**
     * 出货数量
     */
    private Integer deliveryNum;

    /**
     * 出货状态
     */
    private Byte deliveryStatus;

    /**
     * 出货时间
     */
    private LocalDateTime deliveryTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 最后更新时间
     */
    private LocalDateTime lastUpdateTime;

    /**
     * 乐观锁版本号
     */
    private Integer version;

    /**
     * 采购价格
     */
    private BigDecimal primePrice;

    /**
     * 总优惠金额
     */
    private BigDecimal couponAmount;

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

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getShelfIndex() {
        return shelfIndex;
    }

    public void setShelfIndex(Integer shelfIndex) {
        this.shelfIndex = shelfIndex;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getSaleTotalAmount() {
        return saleTotalAmount;
    }

    public void setSaleTotalAmount(BigDecimal saleTotalAmount) {
        this.saleTotalAmount = saleTotalAmount;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getDeliveryNum() {
        return deliveryNum;
    }

    public void setDeliveryNum(Integer deliveryNum) {
        this.deliveryNum = deliveryNum;
    }

    public Byte getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(Byte deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDateTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
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

    public BigDecimal getPrimePrice() {
        return primePrice;
    }

    public void setPrimePrice(BigDecimal primePrice) {
        this.primePrice = primePrice;
    }

    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    @Override
    public String toString() {
        return "OrderItems{" +
            "id = " + id +
            ", orderSn = " + orderSn +
            ", goodsId = " + goodsId +
            ", goodsName = " + goodsName +
            ", shelfIndex = " + shelfIndex +
            ", salePrice = " + salePrice +
            ", unitPrice = " + unitPrice +
            ", saleTotalAmount = " + saleTotalAmount +
            ", totalPrice = " + totalPrice +
            ", totalNum = " + totalNum +
            ", deliveryNum = " + deliveryNum +
            ", deliveryStatus = " + deliveryStatus +
            ", deliveryTime = " + deliveryTime +
            ", createTime = " + createTime +
            ", lastUpdateTime = " + lastUpdateTime +
            ", version = " + version +
            ", primePrice = " + primePrice +
            ", couponAmount = " + couponAmount +
        "}";
    }
}
