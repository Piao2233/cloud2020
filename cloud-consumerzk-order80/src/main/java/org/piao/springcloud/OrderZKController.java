package org.piao.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author：piao
 * @Date：2022/12/11 9:31 AM
 */
@RestController
@Slf4j
public class OrderZKController {

    public static final String INVOKE_URL = "http://spring-cloud-payment-service";

    @Resource
    public RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/zk")
    public String payment() {
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
        return result;
    }
}
