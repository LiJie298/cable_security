package com.bishe.cable_security.controller;

import com.bishe.cable_security.model.User;
import com.bishe.cable_security.service.UserService;
import com.bishe.cable_security.util.BakMsg;
import com.bishe.cable_security.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/up", method = RequestMethod.POST)
    public String signUp(@RequestParam User user) {
        user.setPassword(MD5.GetMD5Code(user.getPassword()));
        return BakMsg.errorMsg("用户名密码不正确");
    }

    @RequestMapping("/webSocket")
    public String websocketTest() {
        return "index";
    }


}
