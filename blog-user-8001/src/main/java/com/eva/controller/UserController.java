package com.eva.controller;

import com.eva.XXX;
import com.eva.dto.Blog;
import com.eva.service.BlogService;
import com.eva.service.Impl.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tuser")
public class UserController {

    @Autowired
    BlogService blogService = new BlogServiceImpl();

    @RequestMapping(value = "/selectBlog",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public List<Blog> test(){
        List<Blog> result = new ArrayList<>();
        result= blogService.selectBlog();
        return result;
    }
}
