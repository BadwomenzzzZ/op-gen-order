package com.genorder.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody    // 将异常以json格式返回给客户端
@Slf4j
public class DefaultExceptionHandler {

    // 捕获Controller抛出的空指针异常
    @ExceptionHandler(NullPointerException.class)
    public BaseResponse handlerNullException(NullPointerException e) {
        e.printStackTrace();
        // 封装异常信息为RespinseResult对象
        return BaseResponse.error("空指针异常");
    }

    // 兜底异常，处理所有代码中未考虑到的异常
    @ExceptionHandler(BizException.class)
    public BaseResponse handlerException(BizException e) {
        // 封装异常信息为RespinseResult对象
        e.printStackTrace();
        return BaseResponse.error(e.getMessage());
    }
}