package com.genorder.dto;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class OrderAddDTO {

    private Integer totalNum = 1;

    private Integer payType;

    private Integer orderState = 1;

    private String accountId;

    /**
     * 出货方式
     */
    private String deliveryMode = "ONE_GOODS";

    /**
     * t_machine_shelf id
     */
    private String msId;

    /**
     * 出货时间
     */
    private Date deliveryTime;


}
