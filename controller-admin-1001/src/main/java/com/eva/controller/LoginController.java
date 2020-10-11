package com.eva.controller;

import com.eva.dto.User;
import com.eva.service.FeignService;
import com.eva.utils.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class LoginController {

    @Autowired
    private FeignService feignService;

    @RequestMapping("/login")
    public JSONResult login(@RequestParam String username,@RequestParam String password){

        User user = feignService.login(username,password);

        if (user != null){
            return JSONResult.build(200,"登录成功",null);
        }else{
            return JSONResult.build(404,"登录失败",null);
        }
    }

    @GetMapping("/hello")
    public JSONResult Hello(){

        String str = feignService.hello1();

        if (str != null){
            return JSONResult.build(200,"执行成功",str);
        }else{
            return JSONResult.build(404,"执行失败",null);
        }
    }

}
