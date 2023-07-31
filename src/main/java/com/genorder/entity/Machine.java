package com.genorder.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author ChenJ
 * @since 2023-07-31
 */
@TableName("t_machine")
public class Machine implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 机器id
     */
    private String machineId;

    /**
     * 机器名称
     */
    private String machineName;

    /**
     * 场地id
     */
    private String areaNo;

    /**
     * 机器信号值
     */
    private Integer gprsSignal;

    /**
     * 设备版本号
     */
    private String version;

    /**
     * 设备类型
     */
    private Byte machineType;

    /**
     * 租户id
     */
    private Long tenantId;

    /**
     * 商户id
     */
    private String accountId;

    /**
     * 补货员id
     */
    private Long replenishId;

    /**
     * 机器详细地址
     */
    private String location;

    /**
     * 机器最后上线时间
     */
    private LocalDateTime lastUploadTime;

    /**
     * 删除状态：1 删除
     */
    private Boolean deleted;

    /**
     * 设备状态：0 正常 1 停用
     */
    private Boolean status;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 机器到期时间
     */
    private LocalDateTime endTime;

    /**
     * 是否开启购物车：1 开启
     */
    private Boolean isCart;

    /**
     * 0 毅普腾协议
     */
    private Byte protocolType;

    /**
     * 上次补货时间
     */
    private LocalDateTime replenishTime;

    /**
     * 联系电话
     */
    private String contactNumber;

    /**
     * 设备管理密码
     */
    private String adminPassword;

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

    public String getAreaNo() {
        return areaNo;
    }

    public void setAreaNo(String areaNo) {
        this.areaNo = areaNo;
    }

    public Integer getGprsSignal() {
        return gprsSignal;
    }

    public void setGprsSignal(Integer gprsSignal) {
        this.gprsSignal = gprsSignal;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Byte getMachineType() {
        return machineType;
    }

    public void setMachineType(Byte machineType) {
        this.machineType = machineType;
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

    public Long getReplenishId() {
        return replenishId;
    }

    public void setReplenishId(Long replenishId) {
        this.replenishId = replenishId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getLastUploadTime() {
        return lastUploadTime;
    }

    public void setLastUploadTime(LocalDateTime lastUploadTime) {
        this.lastUploadTime = lastUploadTime;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Boolean getIsCart() {
        return isCart;
    }

    public void setIsCart(Boolean isCart) {
        this.isCart = isCart;
    }

    public Byte getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(Byte protocolType) {
        this.protocolType = protocolType;
    }

    public LocalDateTime getReplenishTime() {
        return replenishTime;
    }

    public void setReplenishTime(LocalDateTime replenishTime) {
        this.replenishTime = replenishTime;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    @Override
    public String toString() {
        return "Machine{" +
            "id = " + id +
            ", machineId = " + machineId +
            ", machineName = " + machineName +
            ", areaNo = " + areaNo +
            ", gprsSignal = " + gprsSignal +
            ", version = " + version +
            ", machineType = " + machineType +
            ", tenantId = " + tenantId +
            ", accountId = " + accountId +
            ", replenishId = " + replenishId +
            ", location = " + location +
            ", lastUploadTime = " + lastUploadTime +
            ", deleted = " + deleted +
            ", status = " + status +
            ", createTime = " + createTime +
            ", updateTime = " + updateTime +
            ", endTime = " + endTime +
            ", isCart = " + isCart +
            ", protocolType = " + protocolType +
            ", replenishTime = " + replenishTime +
            ", contactNumber = " + contactNumber +
            ", adminPassword = " + adminPassword +
        "}";
    }
}
