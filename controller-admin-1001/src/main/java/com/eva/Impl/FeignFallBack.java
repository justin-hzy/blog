package com.eva.Impl;

import com.eva.dto.User;
import com.eva.service.FeignService;
import com.eva.utils.JSONResult;
import org.springframework.stereotype.Component;

@Component
public class FeignFallBack implements FeignService {

    @Override
    public String hello1() {
        return "error";
    }

    @Override
    public String hello2() {
        return "error";
    }

    @Override
    public String hello3() {
        return "error";
    }

    @Override
    public String hello4() {
        return "error";
    }


    @Override
    public JSONResult login(String username, String password) {
        System.out.println("login服务降级");
        return JSONResult.build(201,"服务降级",null);
    }

    @Override
    public User getUser(User user) {
        return null;
    }
}
