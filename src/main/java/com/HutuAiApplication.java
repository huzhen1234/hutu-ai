package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hutu.mapper")
public class HutuAiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HutuAiApplication.class, args);
    }

}
