package com.eva.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello1")
    public String hello1(){
        System.out.println("访问来1了......");
        return "hello1";
    }

    @RequestMapping("/hello2")
    public String hello2(){
        System.out.println("访问来2了......");
        return "hello2";
    }

    @RequestMapping("/hello3")
    public String hello3(){
        System.out.println("访问来3了......");
        return "hello3";
    }

    @RequestMapping("/hello4")
    @HystrixCommand(fallbackMethod = "hystrixHello4")
    public String hello4(){
        System.out.println("访问来4了......");
        if(true){
            throw new RuntimeException("抛出自定义异常");
        }
        return "hello4";
    }

    //备选方法
    public String hystrixHello4(){
        System.out.println("出现异常，发生熔断！访问来备选方法了......");
        return null;

    }

}
