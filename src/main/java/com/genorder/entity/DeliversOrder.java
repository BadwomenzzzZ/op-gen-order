package com.genorder.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author ChenJ
 * @since 2023-07-31
 */
@TableName("t_delivers_order")
public class DeliversOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 设备ID
     */
    private String machineId;

    /**
     * 设备名称
     */
    private String machineName;

    /**
     * 货道号
     */
    private Integer shelfIndex;

    /**
     * 0未出货，1已出货，2出货失败，3出货中，4部分出货，5出货超时
     */
    private Byte status;

    /**
     * 商品金额(元)
     */
    private BigDecimal price;

    /**
     * 租户id
     */
    private Long tenantId;

    /**
     * 商户id
     */
    private String accountId;

    /**
     * 订单号
     */
    private String orderSn;

    /**
     * 机器出货订单号
     */
    private String deliversSn;

    /**
     * 卡号
     */
    private String cardNo;

    /**
     * 出货类型
     */
    private Byte deliveryType;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 删除标记
     */
    private Byte deleted;

    /**
     * 商品id
     */
    private String goodsId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 总出货数量
     */
    private Integer totalQty;

    /**
     * 出货成功数量
     */
    private Integer quantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public Integer getShelfIndex() {
        return shelfIndex;
    }

    public void setShelfIndex(Integer shelfIndex) {
        this.shelfIndex = shelfIndex;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getDeliversSn() {
        return deliversSn;
    }

    public void setDeliversSn(String deliversSn) {
        this.deliversSn = deliversSn;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Byte getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(Byte deliveryType) {
        this.deliveryType = deliveryType;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
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

    public Integer getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(Integer totalQty) {
        this.totalQty = totalQty;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "DeliversOrder{" +
            "id = " + id +
            ", machineId = " + machineId +
            ", machineName = " + machineName +
            ", shelfIndex = " + shelfIndex +
            ", status = " + status +
            ", price = " + price +
            ", tenantId = " + tenantId +
            ", accountId = " + accountId +
            ", orderSn = " + orderSn +
            ", deliversSn = " + deliversSn +
            ", cardNo = " + cardNo +
            ", deliveryType = " + deliveryType +
            ", createTime = " + createTime +
            ", updateTime = " + updateTime +
            ", deleted = " + deleted +
            ", goodsId = " + goodsId +
            ", goodsName = " + goodsName +
            ", totalQty = " + totalQty +
            ", quantity = " + quantity +
        "}";
    }
}
