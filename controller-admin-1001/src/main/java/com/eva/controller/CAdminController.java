package com.eva.controller;


import com.eva.XXX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/cadmin")
public class CAdminController {

    @Autowired
    private RestTemplate restTemplate;

//xxx
    @RequestMapping(value = "/",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public List<XXX> test(){
/*        List<XXX> list = restTemplate.getForObject("http://localhost:6001/testadmin/",List.class);
        return list;*/
        System.out.println("hello spring-security!");
        return null;
    }

}
