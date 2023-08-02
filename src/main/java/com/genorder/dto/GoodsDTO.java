package com.genorder.dto;

import lombok.Data;

@Data
public class GoodsDTO {

    private Long id;

    private String goodsId;

    private String goodsName;

    private Integer stock;

    private Double price;

}
