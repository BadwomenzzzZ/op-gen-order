package com.genorder.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 设备取货码
 * </p>
 *
 * @author ChenJ
 * @since 2023-07-31
 */
@TableName("t_machine_delivery_code")
public class MachineDeliveryCode implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String machineId;

    /**
     * 租户id
     */
    private Long tenantId;

    /**
     * 商户id
     */
    private String accountId;

    /**
     * 取货码
     */
    private String deliveryCode;

    /**
     * 取货货道
     */
    private String shelfNums;

    /**
     * 出货成功货道
     */
    private String deliveryShelf;

    /**
     * 出货单号
     */
    private String deliversNo;

    /**
     * 取货码状态：0 未使用  1 已使用 2 已失效 
     */
    private Byte status;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 来源：0 系统取货码
     */
    private Byte codeSource;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    /**
     * 取货码失效时间
     */
    private LocalDateTime invalidTime;

    /**
     * 提货码有效天数
     */
    private Integer validDays;

    /**
     * 使用时间
     */
    private LocalDateTime usedTime;

    /**
     * 创建者
     */
    private String creator;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
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

    public String getDeliveryCode() {
        return deliveryCode;
    }

    public void setDeliveryCode(String deliveryCode) {
        this.deliveryCode = deliveryCode;
    }

    public String getShelfNums() {
        return shelfNums;
    }

    public void setShelfNums(String shelfNums) {
        this.shelfNums = shelfNums;
    }

    public String getDeliveryShelf() {
        return deliveryShelf;
    }

    public void setDeliveryShelf(String deliveryShelf) {
        this.deliveryShelf = deliveryShelf;
    }

    public String getDeliversNo() {
        return deliversNo;
    }

    public void setDeliversNo(String deliversNo) {
        this.deliversNo = deliversNo;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Byte getCodeSource() {
        return codeSource;
    }

    public void setCodeSource(Byte codeSource) {
        this.codeSource = codeSource;
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

    public LocalDateTime getInvalidTime() {
        return invalidTime;
    }

    public void setInvalidTime(LocalDateTime invalidTime) {
        this.invalidTime = invalidTime;
    }

    public Integer getValidDays() {
        return validDays;
    }

    public void setValidDays(Integer validDays) {
        this.validDays = validDays;
    }

    public LocalDateTime getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(LocalDateTime usedTime) {
        this.usedTime = usedTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        return "MachineDeliveryCode{" +
            "id = " + id +
            ", machineId = " + machineId +
            ", tenantId = " + tenantId +
            ", accountId = " + accountId +
            ", deliveryCode = " + deliveryCode +
            ", shelfNums = " + shelfNums +
            ", deliveryShelf = " + deliveryShelf +
            ", deliversNo = " + deliversNo +
            ", status = " + status +
            ", orderNo = " + orderNo +
            ", codeSource = " + codeSource +
            ", createTime = " + createTime +
            ", updateTime = " + updateTime +
            ", invalidTime = " + invalidTime +
            ", validDays = " + validDays +
            ", usedTime = " + usedTime +
            ", creator = " + creator +
        "}";
    }
}
