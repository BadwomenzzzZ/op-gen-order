package com.genorder.config;

import com.genorder.enums.CodeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 响应数据基类
 * @author ChenJ
 */
@Data
@AllArgsConstructor
public class BaseResponse {

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 响应消息
     */
    private String msg;

    private Object Data;


    private BaseResponse() {

    }

    public static BaseResponse success(Object data) {
        return new BaseResponse(CodeEnum.SUCCESS.getCode(), CodeEnum.SUCCESS.getMsg(), data);
    }

    public static BaseResponse success(){
        return new BaseResponse(CodeEnum.SUCCESS.getCode(), CodeEnum.SUCCESS.getMsg(), null );
    }

    public static BaseResponse error(String msg) {
        return new BaseResponse(CodeEnum.FAIL.getCode(), msg, null);
    }

    public static BaseResponse error() {
        return new BaseResponse(CodeEnum.FAIL.getCode(), CodeEnum.FAIL.getMsg(), null);
    }
}
