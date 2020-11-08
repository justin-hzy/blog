package com.eva.service;

import com.eva.dto.Blog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BlogService {

    List<Blog> selectBlog();
    Blog selectBlogByID(int id);
    List<Blog>  selectBlogByType(int type_id);
    List<Blog> selectBlogByTag(int tag_id);
}
