package com.eva.mapper;

<<<<<<< HEAD
import com.eva.dto.Tag;
=======
import com.eva.dto.Blog;
>>>>>>> a507214e36606081bf939299c734955cc28349be
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogMapper {

<<<<<<< HEAD
    int addBlog(Tag tag);

    List<Tag> getBlogsByPage();

    int updateBlog(Tag tag);

    Tag getBlogByBlogId(Tag tag);

    int deleteBlogByBlogId(Tag tag);
=======
    int addBlog(Blog Blog);

    List<Blog> getBlogsByPage();

    int updateBlog(Blog Blog);

    Blog getBlogByBlogId(Blog Blog);

    int deleteBlogByBlogId(Blog Blog);
>>>>>>> a507214e36606081bf939299c734955cc28349be
}
