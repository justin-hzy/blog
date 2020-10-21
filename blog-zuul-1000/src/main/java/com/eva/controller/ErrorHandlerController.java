package com.eva.controller;

import com.eva.utils.JSONResult;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


public class ErrorHandlerController implements ErrorController {

    /* 出异常后进入该方法，交由下面的方法处理*/
    @Override
    public String getErrorPath() {
        System.out.println("执行getErrorPath");
        return "error";
    }

    @GetMapping("/error")
    public JSONResult error(){
        System.out.println("进入error");
        return JSONResult.errorException("异常已被ErrorHandlerController处理了");
    }
}
