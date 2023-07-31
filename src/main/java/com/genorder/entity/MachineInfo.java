package com.genorder.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author ChenJ
 * @since 2023-07-31
 */
@TableName("t_machine_info")
public class MachineInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 设备id
     */
    private String machineId;

    /**
     * gps位置经度
     */
    private String gpsLongitude;

    /**
     * gps位置纬度
     */
    private String gpsLatitude;

    /**
     * 机器种类
     */
    private Byte machineMode;

    /**
     * 纸币张数
     */
    private BigDecimal zbqYue;

    /**
     * 硬币张数
     */
    private BigDecimal ybqYue;

    /**
     * 纸币器状态
     */
    private Boolean zbqStatus;

    /**
     * 硬币器状态
     */
    private Boolean ybqStatus;

    /**
     * 压缩机状态
     */
    private Boolean ysjStatus;

    /**
     * 拓展版状态
     */
    private Boolean kzbStatus;

    /**
     * 温度1状态
     */
    private String temperature1;

    /**
     * 温度2状态
     */
    private String temperature2;

    /**
     * 温度3状态
     */
    private String temperature3;

    /**
     * 保留字段
     */
    private Integer ds;

    /**
     * 温控3状态
     */
    private Boolean tem3Status;

    /**
     * 温控2状态
     */
    private Boolean tem2Status;

    /**
     * 温控1状态
     */
    private Boolean tem1Status;

    /**
     * 0表示正常；1表示将要停机；2表示已经停机
     */
    private Boolean status;

    /**
     * 是否启用库存，0表示启用库存，1表示不启用库存
     */
    private Boolean isStock;

    /**
     * 合并货道模式是否开启，0，常规模式；1，合并货道模式
     */
    private Boolean isCombinedShelf;

    /**
     * 商品打折是否开启，0，不启用；1，启用打折
     */
    private Boolean isDiscount;

    /**
     * 掉货检测是否开启，0，未启用；1，启用掉货检测
     */
    private Boolean isInspection;

    /**
     * 门锁状态，0，关闭；1，打开
     */
    private Boolean isDoorLock;

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

    public String getGpsLongitude() {
        return gpsLongitude;
    }

    public void setGpsLongitude(String gpsLongitude) {
        this.gpsLongitude = gpsLongitude;
    }

    public String getGpsLatitude() {
        return gpsLatitude;
    }

    public void setGpsLatitude(String gpsLatitude) {
        this.gpsLatitude = gpsLatitude;
    }

    public Byte getMachineMode() {
        return machineMode;
    }

    public void setMachineMode(Byte machineMode) {
        this.machineMode = machineMode;
    }

    public BigDecimal getZbqYue() {
        return zbqYue;
    }

    public void setZbqYue(BigDecimal zbqYue) {
        this.zbqYue = zbqYue;
    }

    public BigDecimal getYbqYue() {
        return ybqYue;
    }

    public void setYbqYue(BigDecimal ybqYue) {
        this.ybqYue = ybqYue;
    }

    public Boolean getZbqStatus() {
        return zbqStatus;
    }

    public void setZbqStatus(Boolean zbqStatus) {
        this.zbqStatus = zbqStatus;
    }

    public Boolean getYbqStatus() {
        return ybqStatus;
    }

    public void setYbqStatus(Boolean ybqStatus) {
        this.ybqStatus = ybqStatus;
    }

    public Boolean getYsjStatus() {
        return ysjStatus;
    }

    public void setYsjStatus(Boolean ysjStatus) {
        this.ysjStatus = ysjStatus;
    }

    public Boolean getKzbStatus() {
        return kzbStatus;
    }

    public void setKzbStatus(Boolean kzbStatus) {
        this.kzbStatus = kzbStatus;
    }

    public String getTemperature1() {
        return temperature1;
    }

    public void setTemperature1(String temperature1) {
        this.temperature1 = temperature1;
    }

    public String getTemperature2() {
        return temperature2;
    }

    public void setTemperature2(String temperature2) {
        this.temperature2 = temperature2;
    }

    public String getTemperature3() {
        return temperature3;
    }

    public void setTemperature3(String temperature3) {
        this.temperature3 = temperature3;
    }

    public Integer getDs() {
        return ds;
    }

    public void setDs(Integer ds) {
        this.ds = ds;
    }

    public Boolean getTem3Status() {
        return tem3Status;
    }

    public void setTem3Status(Boolean tem3Status) {
        this.tem3Status = tem3Status;
    }

    public Boolean getTem2Status() {
        return tem2Status;
    }

    public void setTem2Status(Boolean tem2Status) {
        this.tem2Status = tem2Status;
    }

    public Boolean getTem1Status() {
        return tem1Status;
    }

    public void setTem1Status(Boolean tem1Status) {
        this.tem1Status = tem1Status;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getIsStock() {
        return isStock;
    }

    public void setIsStock(Boolean isStock) {
        this.isStock = isStock;
    }

    public Boolean getIsCombinedShelf() {
        return isCombinedShelf;
    }

    public void setIsCombinedShelf(Boolean isCombinedShelf) {
        this.isCombinedShelf = isCombinedShelf;
    }

    public Boolean getIsDiscount() {
        return isDiscount;
    }

    public void setIsDiscount(Boolean isDiscount) {
        this.isDiscount = isDiscount;
    }

    public Boolean getIsInspection() {
        return isInspection;
    }

    public void setIsInspection(Boolean isInspection) {
        this.isInspection = isInspection;
    }

    public Boolean getIsDoorLock() {
        return isDoorLock;
    }

    public void setIsDoorLock(Boolean isDoorLock) {
        this.isDoorLock = isDoorLock;
    }

    @Override
    public String toString() {
        return "MachineInfo{" +
            "id = " + id +
            ", machineId = " + machineId +
            ", gpsLongitude = " + gpsLongitude +
            ", gpsLatitude = " + gpsLatitude +
            ", machineMode = " + machineMode +
            ", zbqYue = " + zbqYue +
            ", ybqYue = " + ybqYue +
            ", zbqStatus = " + zbqStatus +
            ", ybqStatus = " + ybqStatus +
            ", ysjStatus = " + ysjStatus +
            ", kzbStatus = " + kzbStatus +
            ", temperature1 = " + temperature1 +
            ", temperature2 = " + temperature2 +
            ", temperature3 = " + temperature3 +
            ", ds = " + ds +
            ", tem3Status = " + tem3Status +
            ", tem2Status = " + tem2Status +
            ", tem1Status = " + tem1Status +
            ", status = " + status +
            ", isStock = " + isStock +
            ", isCombinedShelf = " + isCombinedShelf +
            ", isDiscount = " + isDiscount +
            ", isInspection = " + isInspection +
            ", isDoorLock = " + isDoorLock +
        "}";
    }
}
