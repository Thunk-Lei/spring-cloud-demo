package com.thunk.spring.cloud.demo.service.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: ZhaoLei
 *
 * @Version: 1.0.0
 * @Description:
 * @Date 2019/7/29 23:08
 * Copyright © 2018 ~ 2019
 */

@SpringBootApplication
@EnableEurekaClient
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
}
