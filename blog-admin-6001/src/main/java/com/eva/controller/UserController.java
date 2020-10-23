package com.eva.controller;

import com.eva.dto.User;
import com.eva.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("admin")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("getUser")
    public User getUser(User user){
        User result = userService.getUser(user);
        return result;
    }
}
