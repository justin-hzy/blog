package com.eva.controller;

import com.eva.dto.User;
import com.eva.service.UserService;
import com.eva.utils.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public User login(@RequestParam String username,@RequestParam String password){
        /*redisTemplate.boundValueOps("username").getKey();*/
        User user  = userService.checkUser(username,password);
        return user;
    }
}
