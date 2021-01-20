package com.eva.mapper;

import com.eva.dto.Blog;
import com.eva.vo.BlogsVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public interface BlogMapper {

    List<BlogsVo> selectBlogs();
    Blog selectBlogByID(@Param("blog_id") String blogId);
    List<BlogsVo>  selectBlogsByType(@Param("type_id") String typeId);
    List<BlogsVo> selectBlogsByTag(@Param("tag_id") String tagId);

    List<BlogsVo> selectBlogsByRecommend();
}
