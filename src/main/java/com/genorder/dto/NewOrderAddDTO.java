package com.genorder.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class NewOrderAddDTO {

    /**
     * 设备ids
     */
    private List<String> machineIds;

    /**
     * 出货开始时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date bTime;

    private String bTimeStr;

    /**
     * 出货截止时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date eTime;

    private String eTimeStr;

    /**
     * 总单量
     */
    private Integer totalOrderNum;

    /**
     * 单日最小单量
     */
    private Integer minOrderNum;

    /**
     * 单日最大单量
     */
    private Integer maxOrderNum;

    /**
     * 用户id
     */
    private String accountId;

    /**
     * 微信支付比例
     */
    private Integer wxScale;

    /**
     * 支付宝比例
     */
    private Integer alipayScale;


}
