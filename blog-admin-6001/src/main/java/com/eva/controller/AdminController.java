package com.eva.controller;

import com.eva.dto.Type;
import com.eva.dto.User;
import com.eva.service.AdminService;
import com.eva.service.TypeService;
import com.eva.utils.JSONResult;
import com.eva.utils.PageRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("admin")
public class AdminController {

    private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    private AdminService userService;

    @Autowired
    private TypeService typeService;

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

    @PostMapping("data/addType")
    public JSONResult addType(Type type){
        logger.info("进入addType");
        String uuId = UUID.randomUUID().toString().replace("-","");
        type.setTypeId(uuId);
        int flag = typeService.addType(type);
        if (flag==1){
            return JSONResult.build(500,"提交成功",null);
        }else{
            return JSONResult.build(200,"提交失败",null);
        }
    }

    @PostMapping
    public JSONResult getTypeByPage(@RequestBody PageRequest pageQuery ){
        logger.info("进入getTypeByPage");
        return null;
    }
}
