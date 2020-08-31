package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: CommonResult
 * @Author: lish
 * @Date: 2020/8/27 16:53
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {

    private int code;
    private String massage;
    private T data;

    public CommonResult(int code, String massage) {
        this.code = code;
        this.massage = massage;
    }
}
