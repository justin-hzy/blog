package com.eva.controller;


import com.eva.service.FeignService;
import com.eva.utils.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
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
