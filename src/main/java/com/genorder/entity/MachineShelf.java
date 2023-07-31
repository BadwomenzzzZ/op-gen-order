package com.genorder.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 机器貨道表
 * </p>
 *
 * @author ChenJ
 * @since 2023-07-31
 */
@TableName("t_machine_shelf")
public class MachineShelf implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 机器id
     */
    private String machineId;

    /**
     * 商品id
     */
    private String goodsId;

    /**
     * 貨道号
     */
    private Integer shelfIndex;

    /**
     * 库存：个/克/
     */
    private Integer stock;

    /**
     * 是否损坏（0完好，1损坏）
     */
    private Byte isBroken;

    /**
     * 是否缺货（0有货，1缺货）
     */
    private Byte isStockout;

    /**
     * 上次补货时间
     */
    private LocalDateTime lastStockTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 新增时间
     */
    private LocalDateTime createTime;

    /**
     * 删除状态：0未删除,1已删除
     */
    private Byte deleted;

    /**
     * 貨道容量
     */
    private Integer maxStock;

    /**
     * 单杯容量
     */
    private Integer singleStock;

    private BigDecimal price;

    /**
     * 上次补货后库存
     */
    private Integer lastReplenishStock;

    private BigDecimal couponPrice;

    /**
     * 开启状态：0关闭，1开启
     */
    private Byte status;

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

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getShelfIndex() {
        return shelfIndex;
    }

    public void setShelfIndex(Integer shelfIndex) {
        this.shelfIndex = shelfIndex;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Byte getIsBroken() {
        return isBroken;
    }

    public void setIsBroken(Byte isBroken) {
        this.isBroken = isBroken;
    }

    public Byte getIsStockout() {
        return isStockout;
    }

    public void setIsStockout(Byte isStockout) {
        this.isStockout = isStockout;
    }

    public LocalDateTime getLastStockTime() {
        return lastStockTime;
    }

    public void setLastStockTime(LocalDateTime lastStockTime) {
        this.lastStockTime = lastStockTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    public Integer getMaxStock() {
        return maxStock;
    }

    public void setMaxStock(Integer maxStock) {
        this.maxStock = maxStock;
    }

    public Integer getSingleStock() {
        return singleStock;
    }

    public void setSingleStock(Integer singleStock) {
        this.singleStock = singleStock;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getLastReplenishStock() {
        return lastReplenishStock;
    }

    public void setLastReplenishStock(Integer lastReplenishStock) {
        this.lastReplenishStock = lastReplenishStock;
    }

    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(BigDecimal couponPrice) {
        this.couponPrice = couponPrice;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MachineShelf{" +
            "id = " + id +
            ", machineId = " + machineId +
            ", goodsId = " + goodsId +
            ", shelfIndex = " + shelfIndex +
            ", stock = " + stock +
            ", isBroken = " + isBroken +
            ", isStockout = " + isStockout +
            ", lastStockTime = " + lastStockTime +
            ", updateTime = " + updateTime +
            ", createTime = " + createTime +
            ", deleted = " + deleted +
            ", maxStock = " + maxStock +
            ", singleStock = " + singleStock +
            ", price = " + price +
            ", lastReplenishStock = " + lastReplenishStock +
            ", couponPrice = " + couponPrice +
            ", status = " + status +
        "}";
    }
}
