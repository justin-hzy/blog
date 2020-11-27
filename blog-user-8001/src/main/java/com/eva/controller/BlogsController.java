package com.eva.controller;

import com.eva.dto.Blog;
import com.eva.service.BlogService;
import com.eva.utils.JSONResult;
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
    public JSONResult selectBlogs(){
        logger.info("进入selectBlogs");
        List<BlogsVo> result = new ArrayList<>();
        result= blogService.selectBlogs();
        logger.info(result.toString());
        if(result!=null){
            return JSONResult.build(200,"",result);
        }else{
            return JSONResult.build(500,"",null);
        }
    }

//    点击查看博客详情
    @RequestMapping(value = "/selectBlogByID")
    public JSONResult selectBlogByID(String blogId){
        Blog result= blogService.selectBlogByID(blogId);
        if(result!=null){
            return JSONResult.build(200,"",result);
        }else{
            return JSONResult.build(500,"",null);
        }
    }

//    查看某个分类的博客
    @RequestMapping(value = "/selectBlogsByType")
    public JSONResult selectBlogsByType(String typeId){
        List<Blog> result = new ArrayList<>();
        result= blogService.selectBlogsByType(typeId);
        if(result!=null){
            return JSONResult.build(200,"",result);
        }else{
            return JSONResult.build(500,"",null);
        }
    }

//    查看某个标签的博客
    @RequestMapping(value = "/selectBlogByTag")
    public JSONResult selectBlogsByTag(String tagId){
        List<Blog> result = new ArrayList<>();
        result= blogService.selectBlogsByTag(tagId);
        if(result!=null){
            return JSONResult.build(200,"",result);
        }else{
            return JSONResult.build(500,"",null);
        }
    }


}
