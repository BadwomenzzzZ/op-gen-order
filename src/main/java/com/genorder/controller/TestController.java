package com.genorder.controller;


import com.genorder.config.BaseResponse;
import com.genorder.entity.SysUser;
import com.genorder.mapper.SysUserMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private SysUserMapper sysUserMapper;

    @RequestMapping("/ping")
    public String ping() {
        return "server is ok...";
    }

    @RequestMapping("/listUser")
    public BaseResponse listUser(){
        SysUser sysUser = sysUserMapper.selectById(104L);
        return BaseResponse.success(sysUser);
    }

}
