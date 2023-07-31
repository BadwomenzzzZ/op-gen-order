package com.genorder.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 商品表
 * </p>
 *
 * @author ChenJ
 * @since 2023-07-31
 */
@TableName("t_goods")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 租户id
     */
    private Long tenantId;

    /**
     * 商户id
     */
    private String accountId;

    /**
     * 商品id
     */
    private String goodsId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 条码
     */
    private String barcode;

    /**
     * 成本价格
     */
    private BigDecimal primeCost;

    /**
     * 价格
     */
    private BigDecimal salesPrice;

    /**
     * 图片url
     */
    private String goodsImg;

    private String remark;

    /**
     * 创建者
     */
    private String creator;

    /**
     * 修改者
     */
    private String updater;

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

    private Integer kindId;

    private String goodsDetailImgs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public BigDecimal getPrimeCost() {
        return primeCost;
    }

    public void setPrimeCost(BigDecimal primeCost) {
        this.primeCost = primeCost;
    }

    public BigDecimal getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(BigDecimal salesPrice) {
        this.salesPrice = salesPrice;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
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

    public Integer getKindId() {
        return kindId;
    }

    public void setKindId(Integer kindId) {
        this.kindId = kindId;
    }

    public String getGoodsDetailImgs() {
        return goodsDetailImgs;
    }

    public void setGoodsDetailImgs(String goodsDetailImgs) {
        this.goodsDetailImgs = goodsDetailImgs;
    }

    @Override
    public String toString() {
        return "Goods{" +
            "id = " + id +
            ", tenantId = " + tenantId +
            ", accountId = " + accountId +
            ", goodsId = " + goodsId +
            ", goodsName = " + goodsName +
            ", barcode = " + barcode +
            ", primeCost = " + primeCost +
            ", salesPrice = " + salesPrice +
            ", goodsImg = " + goodsImg +
            ", remark = " + remark +
            ", creator = " + creator +
            ", updater = " + updater +
            ", updateTime = " + updateTime +
            ", createTime = " + createTime +
            ", deleted = " + deleted +
            ", kindId = " + kindId +
            ", goodsDetailImgs = " + goodsDetailImgs +
        "}";
    }
}
