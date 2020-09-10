package com.bishe.cable_security.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;

/**
 * @author lijie
 * @date 2020-07-10 18:27
 */
@Component
public class RedisUtil {

    @Autowired
    private JedisPool jedisPool;

    /**
     * @param key  key
     * @param time 过期时间 单位秒
     * @return 是否成功
     */
    public boolean expire(String key, int time) {
        try {
            if (time > 0) {
                Jedis jedis = jedisPool.getResource();
                jedis.expire(key, time);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 删除缓存
     *
     * @param key 可以传一个值 或多个
     */
    @SuppressWarnings("unchecked")
    public void del(String... key) {
        Jedis jedis = jedisPool.getResource();
        if (key != null && key.length > 0) {
            jedis.del(key);
        }
    }

    /**
     * 普通缓存放入
     *
     * @param key   键
     * @param value 值
     * @return true成功 false失败
     */
    public boolean set(String key, String value) {
        try {
            Jedis jedis = jedisPool.getResource();
            jedis.set(key, value);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Object get(String key) {
        try {
            Jedis jedis = jedisPool.getResource();

            return jedis.get(key);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
