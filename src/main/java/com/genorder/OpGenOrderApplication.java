package com.genorder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.genorder.mapper")
public class OpGenOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpGenOrderApplication.class, args);
    }

}
