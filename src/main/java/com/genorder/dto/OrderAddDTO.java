package com.genorder.dto;

import lombok.Data;

@Data
public class OrderAddDTO {

    private Integer totalNum;

    private Integer payType;

    private Integer orderState;

    private String accountId;

    /**
     * 出货方式
     */
    private String deliveryMode;

    /**
     * t_machine_shelf id
     */
    private String msId;


}
