package com.eva.controller;


import com.eva.XXX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cadmin")
public class CAdminController {

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "/",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public List<XXX> test(){
        List<XXX> list = restTemplate.getForObject("http://localhost:6001/testadmin/",List.class);
        return list;
    }

}
