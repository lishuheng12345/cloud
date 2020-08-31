package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: PaymentController
 * @Author: lish
 * @Date: 2020/8/27 17:11
 * @Description:
 */

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int i = paymentService.create(payment);
        if(i>0){
            return new CommonResult(200,"插入成功");
        }else {
            return new CommonResult(500,"插入失败");
        }

    }
    @GetMapping("/payment/findById/{id}")
    public CommonResult<Payment> findById(@PathVariable("id") int id){
        try {
            Payment payment = paymentService.findById(id);
            return new CommonResult<Payment>(200,"查询成功",payment);
        } catch (Exception e) {
            return new CommonResult<Payment>(500,"查询失败");
        }
    }


}
