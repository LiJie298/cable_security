package com.bishe.cable_security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageSocketController {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;



    @MessageMapping("/hello")
    @SendTo("topic/greetions")
    public void greeting(String value) throws Exception {
        this.simpMessagingTemplate.convertAndSend("/topic/notice", value);
    }

    @RequestMapping(value = "/index")
    public String index() {
        this.simpMessagingTemplate.convertAndSendToUser("userId", "/topic/greetings", "我的消息");
        return "/index";
    }

    /**
     * 用户广播
     * 发送消息广播  用于内部发送使用
     *
     * @param value
     * @return
     */
    @MessageMapping("/change-notice1")
    public void greeting1(String value) {
        this.simpMessagingTemplate.convertAndSend("/topic/notice", value);
    }
}
