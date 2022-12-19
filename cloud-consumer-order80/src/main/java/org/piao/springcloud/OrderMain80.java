package org.piao.springcloud;

import org.piao.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author：piao
 * @Date：2022/12/6 10:10 PM
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "SPRING-CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }

    // RestTemplate提供了多种便捷访问远程Http服务的方法
    // 是一种便捷访问restful服务模版类，是Spring提供的用于访问Rest服务的客户端模版工具类
}
