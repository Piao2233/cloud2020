package org.piao.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.piao.springcloud.entities.CommonResult;
import org.piao.springcloud.entities.Payment;
import org.piao.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @Author：piao
 * @Date：2022/12/14 10:19 PM
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/xxxxxxxx")
    public String getPaymentLB() {
        return paymentFeignService.getPaymentLB();
    }

    @GetMapping("/consumer/payment/feign/timeout")
    public String paymentFeignTimeOut() {
        // openfeign-ribbon 客户端一般默认等待1秒钟
        return paymentFeignService.paymentFeignTimeOut();
    }
}
