package com.bishe.cable_security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author lijie
 * @date 2020-07-10 18:58
 */
@Configuration
public class JedisPoolFactory {

    //自动注入redis配置属性文件
    @Autowired
    private RedisProperties properties;

    @Bean
    public JedisPool getJedisPool() {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxIdle(properties.getJedis().getPool().getMaxIdle());
        config.setMaxTotal(properties.getJedis().getPool().getMaxActive());
        config.setMaxWaitMillis(properties.getJedis().getPool().getMaxWait().toMillis());
        return new JedisPool(config, properties.getHost(), properties.getPort(), 100, properties.getPassword());
    }
}

