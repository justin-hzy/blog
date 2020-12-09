package com.eva.service;

import com.eva.dto.Blog;
import com.eva.dto.Type;
import com.eva.utils.JSONResult;
import com.eva.utils.PageRequest;
import com.eva.utils.PageResult;

import java.util.List;

public interface BlogService {

    public PageResult getBlogsByPage(PageRequest pageRequest);

    int addBlog(Blog blog);

    Blog getBlogByBlogId(Blog blog);

    int updateBlog(Blog blog);

    int deleteBlogByBlogId(Blog blog);

    boolean getBlogByAll();
}
