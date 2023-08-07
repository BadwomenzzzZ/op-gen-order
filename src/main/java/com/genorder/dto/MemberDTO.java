package com.genorder.dto;

import lombok.Data;

@Data
public class MemberDTO {

    /**
     * 租户名称
     */
    private String tenantName;

    /**
     * 商户id
     */
    private String accountId;

    /**
     * 商户名称
     */
    private String name;

}
