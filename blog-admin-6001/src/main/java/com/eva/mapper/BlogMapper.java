package com.eva.mapper;

import com.eva.dto.Tag;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogMapper {

    int addBlog(Tag tag);

    List<Tag> getBlogsByPage();

    int updateBlog(Tag tag);

    Tag getBlogByBlogId(Tag tag);

    int deleteBlogByBlogId(Tag tag);
}
