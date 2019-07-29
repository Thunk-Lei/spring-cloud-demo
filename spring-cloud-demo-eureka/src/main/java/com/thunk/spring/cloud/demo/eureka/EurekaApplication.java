package com.thunk.spring.cloud.demo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: ZhaoLei
 *
 * @Version: 1.0.0
 * @Description: Eureka启动类
 * @Date 2019/7/29 22:58
 * Copyright © 2018 ~ 2019
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
