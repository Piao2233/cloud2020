package org.piao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author：piao
 * @Date：2022/12/20 6:51 PM
 */
@SpringBootApplication
@EnableConfigServer
public class MainAppConfigCenter3344 {

    public static void main(String[] args) {
        SpringApplication.run(MainAppConfigCenter3344.class, args);
    }
}
