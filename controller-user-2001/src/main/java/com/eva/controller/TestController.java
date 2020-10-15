package com.eva.controller;



import com.eva.utils.JSONResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {

/*    @RequestMapping(value = "/",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public List<XXX> test(){

        XXX xxx = new XXX();
        List<XXX> result = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            XXX data = new XXX(i,"2222","2222");
            result.add(data);
        }
        return result;
    }*/

    @GetMapping(value = "/test",produces = {"application/json;charset=UTF-8"})
    public JSONResult test(){
        return JSONResult.build(200,"执行controller-user-2001模块的TestController",null);
    }
}


