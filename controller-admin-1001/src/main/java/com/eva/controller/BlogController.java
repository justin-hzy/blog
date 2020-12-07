package com.eva.controller;

import com.eva.dto.Blog;
import com.eva.service.FeignService;
import com.eva.utils.JSONResult;
import com.eva.utils.PageRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class BlogController {

    private static final Logger logger = LoggerFactory.getLogger(BlogController.class);

    @Autowired
    private FeignService feignService;

    @PostMapping("/getBlogsByPage")
    public JSONResult getBlogsByPage(@RequestBody PageRequest pageRequest){

        logger.info("进入getBlogsByPage");
        JSONResult jsonResult = feignService.getBlogsByPage(pageRequest);
        return  jsonResult;
    }

    @PostMapping("/getBlogsByBlogId")
    public JSONResult getBlogsByBlogId(Blog blog){

        logger.info("进入getBlogsByBlogId");
        JSONResult jsonResult = feignService.getBlogsByBlogId(blog);
        return  jsonResult;
    }




}
