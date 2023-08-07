package com.genorder.dto;

import lombok.Data;

@Data
public class GoodsDTO {

    private Long id;

    private String goodsId;

    private String goodsName;

    private Integer stock;

    private Double price;

    /**
     * 货道号
     */
    private Integer shelfIndex;

    /**
     * 租户名称
     */
    private String tenantName;

    /**
     * 租户id
     */
    private String tenantId;

    /**
     * 商户id
     */
    private String accountId;

    /**
     * 商户名称
     */
    private String name;

}
