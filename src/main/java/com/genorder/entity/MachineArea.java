package com.genorder.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 场地管理表
 * </p>
 *
 * @author ChenJ
 * @since 2023-07-31
 */
@TableName("t_machine_area")
public class MachineArea implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 场地编号
     */
    private String areaNo;

    /**
     * 场地名称
     */
    private String areaName;

    /**
     * 场地类型
     */
    private String areaType;

    /**
     * 场地地址，省级编号
     */
    private Integer provinceId;

    /**
     * 场地地址，市级编号
     */
    private Integer cityId;

    /**
     * 场地地址，区级编号
     */
    private Integer areaId;

    /**
     * 场地详细地址
     */
    private String areaAddress;

    /**
     * 租户id
     */
    private Long tenantId;

    private Byte deleted;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAreaType() {
        return areaType;
    }

    public void setAreaType(String areaType) {
        this.areaType = areaType;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaAddress() {
        return areaAddress;
    }

    public void setAreaAddress(String areaAddress) {
        this.areaAddress = areaAddress;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
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

    @Override
    public String toString() {
        return "MachineArea{" +
            "id = " + id +
            ", areaNo = " + areaNo +
            ", areaName = " + areaName +
            ", areaType = " + areaType +
            ", provinceId = " + provinceId +
            ", cityId = " + cityId +
            ", areaId = " + areaId +
            ", areaAddress = " + areaAddress +
            ", tenantId = " + tenantId +
            ", deleted = " + deleted +
            ", createTime = " + createTime +
            ", updateTime = " + updateTime +
        "}";
    }
}
