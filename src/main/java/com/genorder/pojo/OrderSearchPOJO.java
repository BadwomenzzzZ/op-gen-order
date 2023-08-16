package com.genorder.pojo;

import lombok.Data;

@Data
public class OrderSearchPOJO {

    private String orderSn;

    private String deliversSn;

    private String thirdTransId;

    private String mchId;

    private String machineId;

    private String machineName;

    private String deliveryMode;

    private String areaName;

    private String payStatus;

    private String orderState;
}
