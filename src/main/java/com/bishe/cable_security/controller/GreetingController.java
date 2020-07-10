package com.bishe.cable_security.controller;

import com.alibaba.fastjson.JSONObject;
import com.bishe.cable_security.util.BakMsg;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("topic/greetions")
    public BakMsg greeting(BakMsg bakMsg) throws Exception {
        return new BakMsg(1, "hello", new JSONObject());
    }
}
