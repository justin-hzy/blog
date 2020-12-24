package com.eva.controller;

import com.eva.service.TestService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {


    @Resource(name = "TestServiceImpl1" )
    private TestService testService1;


    @Resource(name = "TestServiceImpl2")
    private TestService testService2;

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

    @GetMapping("/test1")
    public String testController1(){
        return testService1.test();
    }

    @GetMapping("/test2")
    public String testController2(){
        return testService2.test();
    }



}
