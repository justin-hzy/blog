package com.eva.controller;

import com.eva.dto.Tag;
import com.eva.dto.Type;
import com.eva.dto.User;
import com.eva.service.AdminService;
import com.eva.service.TagService;
import com.eva.service.TypeService;
import com.eva.utils.JSONResult;
import com.eva.utils.PageRequest;
import com.eva.utils.PageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("admin")
public class AdminController {

    private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    private AdminService userService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @PostMapping("getUser")
    public User getUser(User user){
        User result = userService.getUser(user);
        return result;
    }

    @PostMapping("getToken")
    public JSONResult getToken(){
        String token = stringRedisTemplate.opsForValue().get("token");
        logger.info("token="+token);
        if ("".equals(token)){
            return JSONResult.build(405,"没有权限",null);
        }else {
            return JSONResult.build(200,"拥有权限",null);
        }
    }

}
