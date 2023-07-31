package com.genorder.enums;


import lombok.Getter;

/**
 * 响应状态码枚举
 * @author ChenJ
 */

@Getter
public enum CodeEnum {

    SUCCESS(0, "成功"),
    FAIL(1, "失败");

    private final Integer code;

    private final String msg;

    CodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
