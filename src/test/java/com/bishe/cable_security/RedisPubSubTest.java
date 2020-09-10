package com.bishe.cable_security;

import com.alibaba.fastjson.JSON;
import com.bishe.cable_security.bean.SimpleMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author lijie
 * @date 2020-09-10 21:33
 * 消息推送测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisPubSubTest {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private ChannelTopic topic;

    @Test
    public void testRedisPubSub() {

        redisTemplate.convertAndSend(
                topic.getTopic(),
                JSON.toJSONString(new SimpleMessage("hefei", "117.17", System.currentTimeMillis()))
        );
    }
}
