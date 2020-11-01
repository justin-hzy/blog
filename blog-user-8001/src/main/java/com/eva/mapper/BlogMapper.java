package com.eva.mapper;

import com.eva.dto.Blog;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public interface BlogMapper {

    List<Blog> selectBlog();
    Blog selectBlogByID();
    List<Blog>  selectBlogByType();
    List<Blog> selectBlogByTag();

}
