package com.bishe.cable_security.config;

import com.fasterxml.jackson.core.SerializableString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.Serializable;

/**
 * @author lijie
 * @date 2020-07-10 18:58
 */
@Configuration
@Slf4j
public class JedisConfig {

    //自动注入redis配置属性文件
    @Autowired
    private RedisProperties properties;

    @Bean
    public JedisConnectionFactory redisConnectionFactory(RedisProperties properties) {
        RedisStandaloneConfiguration config = new RedisStandaloneConfiguration(properties.getHost(),properties.getPort());
        config.setPassword(properties.getPassword());
        config.setDatabase(properties.getDatabase());
        return new JedisConnectionFactory(config);
    }

    @Bean
    public JedisPool getJedisPool() {
        JedisConnectionFactory factory = new JedisConnectionFactory();
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxIdle(properties.getJedis().getPool().getMaxIdle());
        config.setMaxTotal(properties.getJedis().getPool().getMaxActive());
        config.setMaxWaitMillis(properties.getJedis().getPool().getMaxWait().toMillis());
        // 是否启用pool的jmx管理功能, 默认true
        config.setJmxEnabled(true);
        return new JedisPool(config, properties.getHost(), properties.getPort(), 100, properties.getPassword());
    }
}

