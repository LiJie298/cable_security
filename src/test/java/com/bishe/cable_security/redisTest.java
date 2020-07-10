package com.bishe.cable_security;

import com.bishe.cable_security.util.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author lijie
 * @date 2020-07-10 19:13
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class redisTest {

    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void reidsSet() {
        redisUtil.set("test", "test");
        System.out.println(redisUtil.get("test"));
    }
}
