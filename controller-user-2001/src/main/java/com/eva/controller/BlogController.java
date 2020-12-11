package com.eva.controller;


import com.eva.service.FeignService;
import com.eva.utils.JSONResult;
import com.eva.utils.PageRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/blogs")
public class BlogController {

    private static final Logger logger = LoggerFactory.getLogger(BlogController.class);

    @Autowired
    private FeignService feignService;

    @PostMapping(value = "/selectBlogs")
    public JSONResult selectBlogs(@RequestBody PageRequest pageRequest ){
        logger.info("进入selectBlogs");
        JSONResult jsonResult = feignService.selectBlogs(pageRequest);

        return jsonResult;
    }

    @PostMapping(value = "/selectBlogsByRecommend")
    public JSONResult selectBlogsByRecommend(){
        logger.info("进入selectBlogsByRecommend");
        JSONResult jsonResult = feignService.selectBlogsByRecommend();

        return jsonResult;
    }

}


