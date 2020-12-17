package com.eva.controller;

import com.eva.dto.Blog;
import com.eva.service.FeignService;
import com.eva.utils.JSONResult;
import com.eva.utils.PageRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin")
public class BlogController {

    private static final Logger logger = LoggerFactory.getLogger(BlogController.class);

    @Autowired
    private FeignService feignService;

    @PostMapping("/getBlogsByPage")
    public JSONResult getBlogsByPage(PageRequest pageRequest){

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

    @PostMapping("/data/addBlog")
    public JSONResult addBlog(Blog blog){
        logger.info("进入addBlog");
        JSONResult jsonResult = feignService.addBlog(blog);
        return  jsonResult;
    }

    @PostMapping("/data/updateBlog")
    public JSONResult updateBlog(Blog blog){
        logger.info("进入updateBlog");
        JSONResult jsonResult = feignService.updateBlog(blog);
        return  jsonResult;
    }

    @PostMapping("/data/deleteBlogByBlogId")
    public JSONResult deleteBlogByBlogId(Blog blog){
        logger.info("进入deleteBlogByBlogId");
        JSONResult jsonResult = feignService.deleteBlogByBlogId(blog);
        return  jsonResult;
    }

    @PostMapping("/search")
    public JSONResult search(@RequestParam("typeId") String typeId, @RequestParam("title") String title,@RequestParam("recommend") String recommend, @RequestBody PageRequest pageRequest) {
        logger.info("进入search");
        JSONResult jsonResult = feignService.search(typeId,title,recommend,pageRequest);
        return  jsonResult;
    }
}
