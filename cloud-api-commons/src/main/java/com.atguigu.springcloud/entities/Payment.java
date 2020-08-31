package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: Payment
 * @Author: lish
 * @Date: 2020/8/27 16:50
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    private int id;
    private String serial;

}
