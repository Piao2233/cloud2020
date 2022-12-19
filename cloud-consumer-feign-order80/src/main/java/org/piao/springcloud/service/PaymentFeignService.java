package org.piao.springcloud.service;

import feign.Param;
import org.piao.springcloud.entities.CommonResult;
import org.piao.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @Author：piao
 * @Date：2022/12/14 10:12 PM
 */
@Component
@FeignClient(value = "SPRING-CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/lb")
    String getPaymentLB();


    @GetMapping("/payment/feign/timeout")
    String paymentFeignTimeOut();
}
