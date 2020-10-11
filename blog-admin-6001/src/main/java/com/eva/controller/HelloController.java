package com.eva.controller;

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


}
