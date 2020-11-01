package com.eva.service.Impl;

import com.eva.dto.Blog;
import com.eva.mapper.BlogMapper;
import com.eva.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BlogServiceImpl implements BlogService {


    @Autowired
    private BlogMapper blogMapper;


    @Override
    public List<Blog> selectBlog(){

        List<Blog> result =blogMapper.selectBlog();
        return result;
    };
}
