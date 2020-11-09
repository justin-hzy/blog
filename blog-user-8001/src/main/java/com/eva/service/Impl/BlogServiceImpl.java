package com.eva.service.Impl;

import com.eva.dto.Blog;
import com.eva.mapper.BlogMapper;
import com.eva.service.BlogService;
import com.eva.vo.BlogsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public Blog selectBlogByID(int id){
        Blog result =blogMapper.selectBlogByID(id);
        return result;
    };
    @Override
    public List<Blog>  selectBlogByType(int type_id){
        List<Blog> result =blogMapper.selectBlogByType( type_id);
        return result;
    };
    @Override
    public List<Blog> selectBlogByTag(int tag_id){
        List<Blog> result =blogMapper.selectBlogByTag(tag_id);
        return result;
    };
}
