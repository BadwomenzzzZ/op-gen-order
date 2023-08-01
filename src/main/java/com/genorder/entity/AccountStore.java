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
 * @since 2023-08-01
 */
@TableName("t_account_store")
public class AccountStore implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 租户id
     */
    private Long tenantId;

    /**
     * 商户id
     */
    private String accountId;

    /**
     * 商户名称
     */
    private String storeName;

    /**
     * 微信公众号id
     */
    private String mpAppid;

    /**
     * 微信公众号密钥
     */
    private String mpSecret;

    /**
     * 微信商户号
     */
    private String mchId;

    /**
     * 微信商户密钥
     */
    private String apiKey;

    /**
     * 微信商户证书
     */
    private String wxP12;

    /**
     * 是否小薇商户：1 是
     */
    private Boolean isXiaoWei;

    /**
     * 是否开启自动退款：1 开启
     */
    private Boolean autoRefund;

    private LocalDateTime createdTime;

    /**
     * 支付渠道：1 直连， 2 银联
     */
    private Byte paySource;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getMpAppid() {
        return mpAppid;
    }

    public void setMpAppid(String mpAppid) {
        this.mpAppid = mpAppid;
    }

    public String getMpSecret() {
        return mpSecret;
    }

    public void setMpSecret(String mpSecret) {
        this.mpSecret = mpSecret;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getWxP12() {
        return wxP12;
    }

    public void setWxP12(String wxP12) {
        this.wxP12 = wxP12;
    }

    public Boolean getIsXiaoWei() {
        return isXiaoWei;
    }

    public void setIsXiaoWei(Boolean isXiaoWei) {
        this.isXiaoWei = isXiaoWei;
    }

    public Boolean getAutoRefund() {
        return autoRefund;
    }

    public void setAutoRefund(Boolean autoRefund) {
        this.autoRefund = autoRefund;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public Byte getPaySource() {
        return paySource;
    }

    public void setPaySource(Byte paySource) {
        this.paySource = paySource;
    }

    @Override
    public String toString() {
        return "AccountStore{" +
            "id = " + id +
            ", tenantId = " + tenantId +
            ", accountId = " + accountId +
            ", storeName = " + storeName +
            ", mpAppid = " + mpAppid +
            ", mpSecret = " + mpSecret +
            ", mchId = " + mchId +
            ", apiKey = " + apiKey +
            ", wxP12 = " + wxP12 +
            ", isXiaoWei = " + isXiaoWei +
            ", autoRefund = " + autoRefund +
            ", createdTime = " + createdTime +
            ", paySource = " + paySource +
        "}";
    }
}
