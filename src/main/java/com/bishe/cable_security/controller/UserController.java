package com.bishe.cable_security.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bishe.cable_security.model.User;
import com.bishe.cable_security.service.UserService;
import com.bishe.cable_security.util.BakMsg;
import com.bishe.cable_security.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;


    @RequestMapping(value = "/findAll", method = RequestMethod.POST)
    @ResponseBody
    public String signUp() {
        List<User> users = userService.findAll();
        return BakMsg.successMsg(JSONObject.toJSONString(users));
    }


}
