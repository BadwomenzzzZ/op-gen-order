package com.genorder.controller;

import com.genorder.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private UserFeign userFeign;

    @RequestMapping("/ping")
    public String ping() {
        return "server is ok...";
    }

    @RequestMapping("/getInfo")
    public Object getInfo(@RequestHeader("Authorization") String token) {
        return userFeign.getInfo(token);
    }
}
