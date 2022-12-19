package org.piao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author：piao
 * @Date：2022/12/10 10:25 PM
 */
@SpringBootApplication
@EnableDiscoveryClient   // 该注解用于使用zookeeper或者consul作为注册中心时注册服务
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
    }
}
