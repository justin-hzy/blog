package com.eva.mapper;

import com.eva.dto.Blog;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public interface BlogMapper {

    List<Blog> selectBlog();
    Blog selectBlogByID(@Param("id") int id);
    List<Blog>  selectBlogByType(@Param("type_id") int type_id);
    List<Blog> selectBlogByTag(@Param("tag_id") int tag_id);

}
