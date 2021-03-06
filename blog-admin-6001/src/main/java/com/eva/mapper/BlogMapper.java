package com.eva.mapper;




import com.eva.dto.Blog;

import com.eva.vo.BlogVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogMapper {

    int addBlog(Blog Blog);

    List<BlogVo> getBlogsByPage();

    int updateBlog(Blog Blog);

    Blog getBlogByBlogId(Blog Blog);

    int deleteBlogByBlogId(Blog Blog);

    List<Blog> getBlogByAll();

    List<BlogVo> search(String title,String typeId,String recommend);

}
