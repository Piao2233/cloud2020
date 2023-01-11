package org.piao.springcloud;

import org.piao.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author：piao
 * @Date：2023/1/2 1:25 PM
 */
@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider iMessageProvider;

    @GetMapping(value = "sendMessage")
    public String sendMessage() {
        return iMessageProvider.send();
    }
}
