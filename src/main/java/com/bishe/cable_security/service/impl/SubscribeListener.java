package com.bishe.cable_security.service.impl;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

import javax.annotation.Nullable;

/**
 * 监听消息
 *
 * @author lijie
 * @date 2020-09-10 21:28
 */
public class SubscribeListener implements MessageListener {
    @Override
    public void onMessage(Message message, @Nullable byte[] pattern) {
        String body = new String(message.getBody());
        String channel = new String(message.getChannel());
        String pattern_ = new String(pattern);

        System.out.println(body);
        System.out.println(channel);
        System.out.println(pattern_);
    }
}
