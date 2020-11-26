package com.eva.controller;

import com.eva.dto.Blog;
import com.eva.service.BlogService;
import com.eva.vo.BlogsVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/blogs")
public class BlogsController {

    private static final Logger logger = LoggerFactory.getLogger(BlogsController.class);

    @Autowired
    BlogService blogService;

//查询博客列表
    @PostMapping(value = "/selectBlogs")
    public List<BlogsVo> selectBlogs(){
        logger.info("进入selectBlogs");
        List<BlogsVo> result = new ArrayList<>();
        result= blogService.selectBlogs();
        return result;
    }

//    点击查看博客详情
    @RequestMapping(value = "/selectBlogByID")
    public Blog selectBlogByID(String blogId){
        Blog result= blogService.selectBlogByID(blogId);
        return result;
    }

//    查看某个分类的博客
    @RequestMapping(value = "/selectBlogsByType")
    public List<Blog> selectBlogsByType(String typeId){
        List<Blog> result = new ArrayList<>();
        result= blogService.selectBlogsByType(typeId);
        return result;
    }

//    查看某个标签的博客
    @RequestMapping(value = "/selectBlogByTag")
    public List<Blog> selectBlogsByTag(String tagId){
        List<Blog> result = new ArrayList<>();
        result= blogService.selectBlogsByTag(tagId);
        return result;
    }


}
