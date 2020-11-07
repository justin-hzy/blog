package com.eva.controller;

import com.eva.dto.User;
import com.eva.service.UserService;
import com.eva.utils.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @PostMapping("getUser")
    public User getUser(User user){
        User result = userService.getUser(user);
        return result;
    }

    @PostMapping("getToken")
    public JSONResult getToken(){
        String token = stringRedisTemplate.opsForValue().get("token");
        System.out.println("token="+token);
        if ("".equals(token)){
            return JSONResult.build(200,"拥有权限",null);
        }else {
            return JSONResult.build(405,"没有权限",null);
        }
    }
}
