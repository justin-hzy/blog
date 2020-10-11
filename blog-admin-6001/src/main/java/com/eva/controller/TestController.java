package com.eva.controller;

import com.eva.dto.User;
import com.eva.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test1")
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/testMybatis1")
    public User testMybatis(){
/*        String username = "";
        String password = "";*/
        User user = userService.selectUser();
        return user;
    }
}
