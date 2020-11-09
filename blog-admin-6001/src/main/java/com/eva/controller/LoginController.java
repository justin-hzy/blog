package com.eva.controller;

import com.eva.dto.User;
import com.eva.service.UserService;
import com.eva.utils.JSONResult;
import com.eva.utils.JwtUtil;
import com.eva.utils.MD5Code;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("admin")
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/login")
    public JSONResult login(@RequestParam String username,@RequestParam String password){
        /*redisTemplate.boundValueOps("username").getKey();*/
        User user  = userService.checkUser(username, MD5Code.code(password));
        if (user != null){
            String token = JwtUtil.sign(username,password);
            stringRedisTemplate.opsForValue().set("token",token);
            System.out.println("token="+token);
            return JSONResult.build(200,"登录成功",token);
        }else{
            return JSONResult.build(404,"登录失败",null);
        }
    }

    @PostMapping("/getRedis")
    public String getRedis(){
        logger.info("--------------------->[Redis get start]");
        String str = stringRedisTemplate.opsForValue().get("user");
        logger.info("str="+str);
        return  str;
    }
}
