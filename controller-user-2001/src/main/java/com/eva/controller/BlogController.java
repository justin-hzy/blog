package com.eva.controller;


import com.eva.service.FeignService;
import com.eva.utils.JSONResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/blogs")
public class BlogController {

    private static final Logger logger = LoggerFactory.getLogger(BlogController.class);
    @Autowired
    private FeignService feignService;

    @PostMapping(value = "/selectBlogs")
    public JSONResult selectBlogs(){
        logger.info("进入selectBlogs");
        JSONResult jsonResult = feignService.selectBlogs();

        return jsonResult;
    }
}


