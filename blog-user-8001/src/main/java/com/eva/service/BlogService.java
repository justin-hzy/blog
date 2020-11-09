package com.eva.service;

import com.eva.dto.Blog;
import com.eva.vo.BlogsVo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BlogService {

    List<BlogsVo> selectBlogs();
    Blog selectBlogByID(int id);
    List<Blog>  selectBlogByType(int type_id);
    List<Blog> selectBlogByTag(int tag_id);
}
