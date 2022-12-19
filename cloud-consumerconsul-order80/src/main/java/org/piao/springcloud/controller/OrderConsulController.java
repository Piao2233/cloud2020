package org.piao.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.piao.springcloud.entities.CommonResult;
import org.piao.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author：piao
 * @Date：2022/12/11 10:41 AM
 */
@RestController
@Slf4j
public class OrderConsulController {

    public static final String INVOKE_URL = "http://spring-cloud-payment-service";

    @Resource
    public RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/consul")
    public String payment() {
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
        return result;
    }
}
