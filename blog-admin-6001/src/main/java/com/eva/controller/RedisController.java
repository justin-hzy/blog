package com.eva.controller;

import com.eva.service.BlogService;
import com.eva.utils.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("redis")
public class RedisController {



    @Autowired
    private BlogService blogService;

    @GetMapping("syn")
    public JSONResult redisSyn(){
        Boolean result = blogService.getBlogByAll();
        if (result==true){
            return JSONResult.build(200,"同步成功",null);
        }else {
            return JSONResult.build(500,"同步成功",null);
        }
    }
}
