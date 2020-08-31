package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: Payment80
 * @Author: lish
 * @Date: 2020/8/28 16:08
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class Payment80 {
    public static void main(String[] args) {
        SpringApplication.run(Payment80.class);
    }
}
