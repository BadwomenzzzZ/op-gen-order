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
 * 订单表
 * </p>
 *
 * @author ChenJ
 * @since 2023-07-31
 */
@TableName("t_order")
@Builder
public class Order implements Serializable {

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
     * 设备订单号
     */
    private String deliversSn;

    /**
     * 第三方订单号（支付方式为取货码的时候记录取货码
     */
    private String outTransId;

    /**
     * 第三方：微信、支付宝交易流水号
     */
    private String thirdTransId;

    /**
     * 订单金额
     */
    private BigDecimal orderPrice;

    /**
     * 实际支付金额
     */
    private BigDecimal payPrice;

    /**
     * 支付方式
     */
    private Integer payType;

    /**
     * 支付时间
     */
    private LocalDateTime payTime;

    /**
     * 订单状态 :  0 待出货，1 已出货，2 出货失败，3 出货中，4 部分出货， 5 出货超时
     */
    private Byte orderStatus;

    /**
     * 支付状态：0 未支付，1  已支付，2 退款中，3 已退款
     */
    private Byte payStatus;

    /**
     * 订单客户端来源
     */
    private String clientSource;

    /**
     * 用户唯一标识 （刷卡时就是卡号）
     */
    private String userId;

    /**
     * 用户 app id
     */
    private String appId;

    /**
     * 商户号
     */
    private String mchId;

    /**
     * 设备id
     */
    private String machineId;

    /**
     * 设备名称
     */
    private String machineName;

    /**
     * 设备类型
     */
    private String machineType;

    /**
     * 出货方式
     */
    private String deliveryMode;

    /**
     * 费率
     */
    private BigDecimal poundage;

    /**
     * 根据费率计算出的具体手续费
     */
    private BigDecimal poundageAmount;

    /**
     * 场地id
     */
    private String areaNo;

    /**
     * 场地名称
     */
    private String areaName;

    /**
     * 城市
     */
    private String city;

    /**
     * 租户id
     */
    private Long tenantId;

    /**
     * 商户id
     */
    private String accountId;

    /**
     * 下单时间
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
     * 实际退款金额
     */
    private BigDecimal refundAmount;

    /**
     * 货道号
     */
    private String machineShelves;

    /**
     * 支付渠道：0 直连，1 银联
     */
    private Integer payChannel;

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

    public String getDeliversSn() {
        return deliversSn;
    }

    public void setDeliversSn(String deliversSn) {
        this.deliversSn = deliversSn;
    }

    public String getOutTransId() {
        return outTransId;
    }

    public void setOutTransId(String outTransId) {
        this.outTransId = outTransId;
    }

    public String getThirdTransId() {
        return thirdTransId;
    }

    public void setThirdTransId(String thirdTransId) {
        this.thirdTransId = thirdTransId;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public BigDecimal getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(BigDecimal payPrice) {
        this.payPrice = payPrice;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public LocalDateTime getPayTime() {
        return payTime;
    }

    public void setPayTime(LocalDateTime payTime) {
        this.payTime = payTime;
    }

    public Byte getOrderState() {
        return orderStatus;
    }

    public void setOrderState(Byte orderState) {
        this.orderStatus = orderState;
    }

    public Byte getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Byte payStatus) {
        this.payStatus = payStatus;
    }

    public String getClientSource() {
        return clientSource;
    }

    public void setClientSource(String clientSource) {
        this.clientSource = clientSource;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
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

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public String getDeliveryMode() {
        return deliveryMode;
    }

    public void setDeliveryMode(String deliveryMode) {
        this.deliveryMode = deliveryMode;
    }

    public BigDecimal getPoundage() {
        return poundage;
    }

    public void setPoundage(BigDecimal poundage) {
        this.poundage = poundage;
    }

    public BigDecimal getPoundageAmount() {
        return poundageAmount;
    }

    public void setPoundageAmount(BigDecimal poundageAmount) {
        this.poundageAmount = poundageAmount;
    }

    public String getAreaNo() {
        return areaNo;
    }

    public void setAreaNo(String areaNo) {
        this.areaNo = areaNo;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getMachineShelves() {
        return machineShelves;
    }

    public void setMachineShelves(String machineShelves) {
        this.machineShelves = machineShelves;
    }

    public Integer getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Integer payChannel) {
        this.payChannel = payChannel;
    }

    @Override
    public String toString() {
        return "Order{" +
            "id = " + id +
            ", orderSn = " + orderSn +
            ", deliversSn = " + deliversSn +
            ", outTransId = " + outTransId +
            ", thirdTransId = " + thirdTransId +
            ", orderPrice = " + orderPrice +
            ", payPrice = " + payPrice +
            ", payType = " + payType +
            ", payTime = " + payTime +
            ", orderState = " + orderStatus +
            ", payStatus = " + payStatus +
            ", clientSource = " + clientSource +
            ", userId = " + userId +
            ", appId = " + appId +
            ", mchId = " + mchId +
            ", machineId = " + machineId +
            ", machineName = " + machineName +
            ", machineType = " + machineType +
            ", deliveryMode = " + deliveryMode +
            ", poundage = " + poundage +
            ", poundageAmount = " + poundageAmount +
            ", areaNo = " + areaNo +
            ", areaName = " + areaName +
            ", city = " + city +
            ", tenantId = " + tenantId +
            ", accountId = " + accountId +
            ", createTime = " + createTime +
            ", lastUpdateTime = " + lastUpdateTime +
            ", version = " + version +
            ", refundAmount = " + refundAmount +
            ", machineShelves = " + machineShelves +
            ", payChannel = " + payChannel +
        "}";
    }
}
