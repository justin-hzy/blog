package com.eva.controller;


import com.eva.dto.Blog;
import com.eva.service.BlogService;
import com.eva.utils.JSONResult;
import com.eva.utils.PageRequest;
import com.eva.utils.PageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;


@RestController
@RequestMapping("admin")
public class BlogController {

    private static final Logger logger = LoggerFactory.getLogger(BlogController.class);

    @Autowired
    private BlogService blogService;

    @Autowired
    private RedisTemplate redisTemplate;

    @PostMapping("/getBlogsByPage")
    public JSONResult getBlogsByPage(@RequestBody PageRequest pageRequest){
        logger.info("进入getBlogsByPage");
        PageResult pageResult = blogService.getBlogsByPage(pageRequest);
        if (pageResult != null){
            return JSONResult.build(200,"博客分页查询成功",pageResult);
        }else {
            return JSONResult.build(500,"博客分页查询失败",pageResult);
        }
    }

    @PostMapping("/getBlogsByBlogId")
    public JSONResult getBlogsByBlogId(@RequestBody Blog blog){
        logger.info("进入getBlogsByBlogId");
        Blog result = blogService.getBlogByBlogId(blog);
        if (result!=null){
            return JSONResult.build(200,"博客查询成功",result);
        }else {
            return JSONResult.build(500,"博客查询失败",result);
        }
    }

    @PostMapping("data/addBlog")
    public JSONResult addBlog(@RequestBody Blog blog){
        logger.info("进入addBlog");
        int result = blogService.addBlog(blog);
        if (result!=0){
            return JSONResult.build(200,"博客插入成功",result);
        }else {
            return JSONResult.build(500,"博客插入失败",result);
        }
    }

    @PostMapping("data/updateBlog")
    public JSONResult updateBlog(@RequestBody Blog blog){
        logger.info("进入updateBlog");
        int result = blogService.updateBlog(blog);
        if (result!=0){
            return JSONResult.build(200,"博客更新成功",result);
        }else {
            return JSONResult.build(500,"博客更新失败",result);
        }
    }

    @PostMapping("data/deleteBlogByBlogId")
    public JSONResult deleteBlogByBlogId(@RequestBody Blog blog){
        logger.info("进入deleteBlogByBlogId");
        int result = blogService.deleteBlogByBlogId(blog);
        if (result!=0){
            return JSONResult.build(200,"博客删除成功",result);
        }else {
            return JSONResult.build(500,"博客删除失败",result);
        }
    }
}
