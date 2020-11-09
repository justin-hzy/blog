package com.eva.controller;

import com.eva.XXX;
import com.eva.dto.Blog;
import com.eva.service.BlogService;
import com.eva.service.Impl.BlogServiceImpl;
import com.eva.vo.BlogsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/blogs")
public class BlogsController {

    @Autowired
    BlogService blogService;

    @RequestMapping(value = "/selectBlogs")
    public List<BlogsVo> selectBlogs(){
        List<BlogsVo> result = new ArrayList<>();
        result= blogService.selectBlogs();
        return result;
    }

    @RequestMapping(value = "/selectBlogByID")
    public Blog selectBlogByID(int id){
        Blog result= blogService.selectBlogByID(id);
        return result;
    }

    @RequestMapping(value = "/selectBlogByType")
    public List<Blog> selectBlogByType(int type_id){
        List<Blog> result = new ArrayList<>();
        result= blogService.selectBlogByType(type_id);
        return result;
    }

    @RequestMapping(value = "/selectBlogByTag")
    public List<Blog> selectBlogByTag(int tag_id){
        List<Blog> result = new ArrayList<>();
        result= blogService.selectBlogByTag(tag_id);
        return result;
    }


}
