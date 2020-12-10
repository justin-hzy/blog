package com.eva.Impl;

import com.eva.dto.Blog;
import com.eva.dto.Tag;
import com.eva.dto.Type;
import com.eva.dto.User;
import com.eva.service.FeignService;
import com.eva.utils.JSONResult;
import com.eva.utils.PageRequest;
import org.springframework.stereotype.Component;

@Component
public class FeignFallBack implements FeignService {

    @Override
    public String hello1() {
        return "error";
    }

    @Override
    public String hello2() {
        return "error";
    }

    @Override
    public String hello3() {
        return "error";
    }

    @Override
    public String hello4() {
        return "error";
    }


    @Override
    public JSONResult login(String username, String password) {
        System.out.println("login服务降级");
        return JSONResult.build(201,"首次调用！服务降级",null);
    }

    @Override
    public User getUser(User user) {
        return null;
    }

    @Override
    public String getRedis() {
        System.out.println("login服务降级");
        return new String("login服务降级");
    }

    @Override
    public JSONResult getToken() {
        return JSONResult.build(201,"getToken服务降级",null);
    }

    @Override
    public JSONResult addType(Type type) {
        return JSONResult.build(201,"addType服务降级",null);
    }

    @Override
    public JSONResult getTypeByPage(PageRequest pageRequest) {
        return JSONResult.build(201,"getTypeByPage服务降级",null);
    }

    @Override
    public JSONResult getTypeByTypeId(Type type) {
        return JSONResult.build(201,"getTypeByTypeId服务降级",null);
    }

    @Override
    public JSONResult updateType(Type type) {
        return JSONResult.build(201,"updateType服务降级",null);
    }

    @Override
    public JSONResult deleteTypeByTypeId(Type type) {
        return JSONResult.build(201,"deleteTypeByTypeId服务降级",null);
    }

    @Override
    public JSONResult getTagsByPage(PageRequest pageRequest) {
        return JSONResult.build(201,"getTagsByPage服务降级",null);
    }

    @Override
    public JSONResult getTagByTagId(Tag tag) {
        return JSONResult.build(201,"getTagByTagId服务降级",null);
    }

    @Override
    public JSONResult updateTag(Tag tag) {
        return JSONResult.build(201,"updateTag服务降级",null);
    }

    @Override
    public JSONResult addTag(Tag tag) {
        return JSONResult.build(201,"addTag服务降级",null);
    }

    @Override
    public JSONResult deleteTagByTagId(Tag tag) {
        return JSONResult.build(201,"deleteTagByTagId服务降级",null);
    }

    @Override
    public JSONResult getBlogsByPage(PageRequest pageRequest) {
        return JSONResult.build(201,"getBlogsByPage服务降级",null);
    }

    @Override
    public JSONResult getBlogsByBlogId(Blog blog) {
        return JSONResult.build(201,"getBlogsByBlogId服务降级",null);
    }

    @Override
    public JSONResult addBlog(Blog blog) {
        return JSONResult.build(201,"addBlog服务降级",null);
    }

    @Override
    public JSONResult updateBlog(Blog blog) {
        return JSONResult.build(201,"updateBlog服务降级",null);
    }

    @Override
    public JSONResult deleteBlogByBlogId(Blog blog) {
        return JSONResult.build(201,"deleteBlogByBlogId服务降级",null);
    }

    @Override
    public JSONResult getTypeByAll() {
        return JSONResult.build(201,"getTypeByAll服务降级",null);
    }


}
