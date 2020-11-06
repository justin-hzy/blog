package com.eva.service.Impl;

import com.eva.dto.User;
import com.eva.mapper.UserMapper;
import com.eva.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User checkUser(String username, String password) {
        System.out.println("password="+password);
        Map map = new HashMap<>();
        map.put("username",username);
        map.put("password",password);
        User user = userMapper.findByUsernameAndPassword(map);
        System.out.println("user="+user);
        return user;
    }

    @Override
    public User selectUser() {
        User user = userMapper.selectUser();
        return user;
    }

    @Override
    public User getUser(User user) {
        User result = userMapper.getUser(user);
        return result;
    }
}
