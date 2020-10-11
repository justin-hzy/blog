package com.eva.controller;

import com.eva.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    FeignService feignService;

    @RequestMapping("/consumer1")
    public String helloConsumer1(){
        return feignService.hello1();
    }

    @RequestMapping("/consumer2")
    public String helloConsumer2(){
        return feignService.hello2();
    }
}
