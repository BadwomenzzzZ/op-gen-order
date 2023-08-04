package com.genorder.feign;


import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "userFeign" , url = "${feign.system.url}")
public interface UserFeign {

    @GetMapping("/prod-api/system/user/getInfo")
    JSONObject getInfo(@RequestHeader("Authorization") String token);

}
