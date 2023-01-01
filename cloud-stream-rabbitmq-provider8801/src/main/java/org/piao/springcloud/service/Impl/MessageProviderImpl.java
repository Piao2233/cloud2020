package org.piao.springcloud.service.Impl;

import cn.hutool.core.lang.UUID;
import org.piao.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author：piao
 * @Date：2022/12/29 9:49 PM
 */
@EnableBinding(Source.class) // 定义消息的推送管道
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel messageChannel; // 消息发送管道

    /**
     * @return
     */
    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        messageChannel.send(MessageBuilder.withPayload(serial).build());
    }
}
