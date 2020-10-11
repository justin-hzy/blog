package com.eva.controller;

import com.eva.XXX;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/testadmin")
public class TestAdminController {
    @RequestMapping(value = "/",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public List<XXX> test(){
//        List<Map<String, Object>> result = new ArrayList<>();
//        for(int i = 0; i < 3; i++){
//            Map<String, Object> data = new HashMap<>();
//            data.put("id", i+1);
//            data.put("name", "test name " + i);
//            data.put("age", 20+i);
//            result.add(data);
//        }
        List<XXX> result = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            XXX data = new XXX();
            result.add(data);
        }
        return result;
    }
}
