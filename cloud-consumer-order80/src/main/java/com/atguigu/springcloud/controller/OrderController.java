package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: OrderController
 * @Author: lish
 * @Date: 2020/8/28 16:12
 * @Description:
 */
@RestController
public class OrderController {


    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/consumer/payment/create")
    public CommonResult create(Payment payment){
        return restTemplate.postForObject("http://localhost:8001/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/findById/{id}")
    public CommonResult<Payment> findById(@PathVariable("id") int id){
       return restTemplate.getForObject("http://localhost:8001/payment/findById/"+id,CommonResult.class);
    }
}
