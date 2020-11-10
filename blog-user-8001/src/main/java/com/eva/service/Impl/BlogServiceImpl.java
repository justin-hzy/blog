package com.eva.service.Impl;

import com.eva.dto.Blog;
import com.eva.mapper.BlogMapper;
import com.eva.service.BlogService;
import com.eva.vo.BlogsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BlogServiceImpl implements BlogService {


    @Autowired
    private BlogMapper blogMapper;


    @Override
    public List<BlogsVo> selectBlogs(){

        List<BlogsVo> result =blogMapper.selectBlogs();
        return result;
    };

    @Override
    public Blog selectBlogByID(String blogId){
        Blog result =blogMapper.selectBlogByID(blogId);
        return result;
    };
    @Override
    public List<Blog>  selectBlogsByType(String typeId){
        List<Blog> result =blogMapper.selectBlogsByType( typeId);
        return result;
    };
    @Override
    public List<Blog> selectBlogsByTag(String tagId){
        List<Blog> result =blogMapper.selectBlogsByTag(tagId);
        return result;
    };
}
