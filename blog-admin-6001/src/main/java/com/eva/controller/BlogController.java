package com.eva.controller;


import com.eva.dto.Blog;
import com.eva.service.BlogService;
import com.eva.utils.JSONResult;
import com.eva.utils.PageRequest;
import com.eva.utils.PageResult;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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

    /*
   requestVolumeThreshold:
   用来设置在滚动时间窗中，断路器熔断的最小请求数。
   例如，默认该值为20的时候，如果滚动时间窗（默认10秒）内仅收到19个请求，
   即使这19个请求都失败了，断路器也不会打开。

   sleepWindowInMilliseconds:
   用来设置当断路器打开之后的休眠时间窗。休眠时间窗结束之后，
   会将断路器设置为"半开"状态，尝试熔断的请求命令，如果依然时候就将断路器继续设置为"打开"状态，
   如果成功，就设置为"关闭"状态。

   circuitBreaker.errorThresholdPercentage：该属性用来设置断路器打开的错误百分比条件。
   默认值为50，表示在滚动时间窗中，在请求值超过requestVolumeThreshold阈值的前提下，
   如果错误请求数百分比超过50，就把断路器设置为"打开"状态，否则就设置为"关闭"状态。
   */
    @PostMapping("/getBlogsByPage")
    @HystrixCommand(commandProperties = {
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")
    },fallbackMethod = "errorHystrix")
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

    @PostMapping("/search")
    public JSONResult search(@RequestParam("title") String title,@RequestParam("typeId") String typeId,@RequestParam("recommend") String recommend,@RequestBody PageRequest pageRequest){
        logger.info("进入search");
        PageResult pageResult =  blogService.search(title,typeId,recommend,pageRequest);
        if (pageResult != null){
            return JSONResult.build(200,"博客分页条件查询成功",pageResult);
        }else {
            return JSONResult.build(500,"博客分页条件查询失败",null);
        }
    }

    private JSONResult errorHystrix(PageRequest pageRequest){
        return JSONResult.build(500,"触发熔断",null);
    }
}
