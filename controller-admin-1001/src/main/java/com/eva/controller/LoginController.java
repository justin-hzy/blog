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

    @PostMapping("/login")
    public JSONResult login(@RequestParam String username,@RequestParam String password){

        JSONResult jSONResult = feignService.login(username,password);

        return jSONResult;
    }

    @PostMapping("/getRedis")
    public String getRedis(){
        String str = feignService.getRedis();
        return str;
    }
}
