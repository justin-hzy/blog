package com.eva.service;

import com.eva.dto.Blog;
import com.eva.vo.BlogsVo;

import java.util.List;


public interface BlogService {

    List<BlogsVo> selectBlogs();
    Blog selectBlogByID(String blogId);
    List<Blog>  selectBlogsByType(String typeId);
    List<Blog> selectBlogsByTag(String tagId);
}
