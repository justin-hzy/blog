package com.eva.controller;

import com.eva.service.FeignService;
import com.eva.utils.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class TestController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/hello")
    public JSONResult Hello(){

        String str = feignService.hello1();
        /*int i = 1/0;*/
        if (str != null){
            return JSONResult.build(200,"执行成功",str);
        }else{
            return JSONResult.build(404,"执行失败",null);
        }
    }
}
