package com.eva.controller;

import com.eva.dto.Blog;
import com.eva.service.BlogService;
import com.eva.utils.JSONResult;
import com.eva.utils.PageRequest;
import com.eva.utils.PageResult;
import com.eva.vo.BlogsVo;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/blogs")
public class BlogsController {

    private static final Logger logger = LoggerFactory.getLogger(BlogsController.class);

    @Autowired
    BlogService blogService;

//查询博客列表
    @RequestMapping(value = "/selectBlogs")
    public JSONResult selectBlogs(@RequestBody PageRequest pageRequest ){

        PageResult pageResult = blogService.selectBlogs(pageRequest);
        if(pageResult!=null){
            return JSONResult.build(200,"",pageResult);
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

//    查看某个分类的博客列表
    @RequestMapping(value = "/selectBlogsByType")
    public JSONResult selectBlogsByType(@Param("tagId") String typeId, @RequestBody PageRequest pageRequest ){
        PageResult pageResult = blogService.selectBlogsByType(typeId,pageRequest);
        if(pageResult!=null){
            return JSONResult.build(200,"",pageResult);
        }else{
            return JSONResult.build(500,"",null);
        }
    }

//    查看某个标签的博客列表
    @RequestMapping(value = "/selectBlogsByTag")
    public JSONResult selectBlogsByTag(@Param("tagId") String tagId,@RequestBody PageRequest pageRequest ){
        PageResult pageResult = blogService.selectBlogsByTag(tagId,pageRequest);
        if(pageResult!=null){
            return JSONResult.build(200,"",pageResult);
        }else{
            return JSONResult.build(500,"",null);
        }
    }

//  最新推荐博客
    @RequestMapping(value = "/selectBlogsByRecommend")
    public JSONResult selectBlogsByRecommend(@RequestBody PageRequest pageRequest ){
        PageResult pageResult = blogService.selectBlogsByRecommend(pageRequest);
        if(pageResult!=null){
            return JSONResult.build(200,"",pageResult);
        }else{
            return JSONResult.build(500,"",null);
        }
    }


}
