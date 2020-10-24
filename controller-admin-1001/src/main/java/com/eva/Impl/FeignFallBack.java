package com.eva.Impl;

import com.eva.dto.User;
import com.eva.service.FeignService;
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
    public User login(String username,String password) {
        return null;
    }

    @Override
    public User getUser(User user) {
        return null;
    }
}
