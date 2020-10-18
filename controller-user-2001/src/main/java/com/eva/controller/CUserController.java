package com.eva.controller;


import com.eva.XXX;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/cuser")
public class CUserController {
    @RequestMapping(value = "/",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public List<XXX> test(){

        XXX xxx = new XXX();
        List<XXX> result = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            XXX data = new XXX(i,"2222","2222");
            result.add(data);
        }
        return result;
    }
}


