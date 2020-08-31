package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * @ClassName: PaymentService
 * @Author: lish
 * @Date: 2020/8/27 17:08
 * @Description:
 */

public interface PaymentService {

    public int create(Payment payment);


    public Payment findById(int id);


}
