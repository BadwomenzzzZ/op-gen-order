package com.genorder.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 补货记录表
 * </p>
 *
 * @author ChenJ
 * @since 2023-11-22
 */
@TableName("t_replenish_log")
@Data
@Builder
public class ReplenishLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String machineId;

    private String machineName;

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
     * 补货前库存
     */
    private Integer beforeStock;

    /**
     * 本次补货数量
     */
    private Integer sumStock;

    /**
     * 补货后库存
     */
    private Integer afterStock;

    /**
     * 补货记录id
     */
    private Long replenishLogId;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    /**
     * 创建人
     */
    private String createUser;

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

    public Integer getBeforeStock() {
        return beforeStock;
    }

    public void setBeforeStock(Integer beforeStock) {
        this.beforeStock = beforeStock;
    }

    public Integer getSumStock() {
        return sumStock;
    }

    public void setSumStock(Integer sumStock) {
        this.sumStock = sumStock;
    }

    public Integer getAfterStock() {
        return afterStock;
    }

    public void setAfterStock(Integer afterStock) {
        this.afterStock = afterStock;
    }

    public Long getReplenishLogId() {
        return replenishLogId;
    }

    public void setReplenishLogId(Long replenishLogId) {
        this.replenishLogId = replenishLogId;
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

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Override
    public String toString() {
        return "ReplenishLog{" +
            "id = " + id +
            ", machineId = " + machineId +
            ", machineName = " + machineName +
            ", tenantId = " + tenantId +
            ", accountId = " + accountId +
            ", replenishId = " + replenishId +
            ", beforeStock = " + beforeStock +
            ", sumStock = " + sumStock +
            ", afterStock = " + afterStock +
            ", replenishLogId = " + replenishLogId +
            ", createTime = " + createTime +
            ", updateTime = " + updateTime +
            ", createUser = " + createUser +
        "}";
    }
}
