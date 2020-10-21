package com.eva.controller;

import com.eva.dto.User;
import com.eva.service.FeignService;
import com.eva.utils.JSONResult;
import com.eva.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin")
public class LoginController {

    @Autowired
    private FeignService feignService;

    @Autowired
    private RedisTemplate redisTemplate;

    @PostMapping("/login")
    public JSONResult login(@RequestParam String username,@RequestParam String password){

        User user = feignService.login(username,password);

        if (user != null){
            String token = JwtUtil.sign(username,password);
            System.out.println("token="+token);
            return JSONResult.build(200,"登录成功",token);
        }else{
            return JSONResult.build(404,"登录失败",null);
        }
    }



}
