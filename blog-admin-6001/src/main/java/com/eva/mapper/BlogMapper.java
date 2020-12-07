package com.eva.mapper;




import com.eva.dto.Blog;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogMapper {

    int addBlog(Blog Blog);

    List<Blog> getBlogsByPage();

    int updateBlog(Blog Blog);

    Blog getBlogByBlogId(Blog Blog);

    int deleteBlogByBlogId(Blog Blog);

}
