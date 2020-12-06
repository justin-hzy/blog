package com.eva.controller;

import com.eva.dto.Blog;
import com.eva.service.BlogService;
import com.eva.utils.JSONResult;
import com.eva.utils.PageRequest;
import com.eva.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @PostMapping("/getBlogsByPage")
    public JSONResult getBlogsByPage(@RequestBody PageRequest pageRequest){
        PageResult pageResult = blogService.getBlogsByPage(pageRequest);
        if (pageResult != null){
            return JSONResult.build(200,"博客分页查询成功",pageResult);
        }else {
            return JSONResult.build(500,"博客分页查询失败",pageResult);
        }
    }

    @PostMapping("/getBlogsByBlogId")
    public JSONResult getBlogsByBlogId(@RequestBody Blog blog){
        Blog result = blogService.getBlogByBlogId(blog);
        if (result!=null){
            return JSONResult.build(200,"博客查询成功",result);
        }else {
            return JSONResult.build(500,"博客查询失败",result);
        }
    }

    @PostMapping("data/addBlog")
    public JSONResult addBlog(@RequestBody PageRequest pageRequest){
        return null;
    }

    @PostMapping("data/updateBlog")
    public JSONResult updateBlog(@RequestBody PageRequest pageRequest){
        return null;
    }

    @PostMapping("data/deleteBlogByBlogId")
    public JSONResult deleteBlogByBlogId(@RequestBody PageRequest pageRequest){
        return null;
    }
}
