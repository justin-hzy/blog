package com.eva.service;

import com.eva.dto.Blog;
import com.eva.utils.PageRequest;
import com.eva.utils.PageResult;
import com.eva.vo.BlogsVo;
import com.github.pagehelper.PageInfo;

import java.util.List;


public interface BlogService {

    PageResult selectBlogs(PageRequest pageRequest);
    Blog selectBlogByID(String blogId);
    PageResult  selectBlogsByType(String typeId,PageRequest pageRequest);
    PageResult selectBlogsByTag(String tagId,PageRequest pageRequest);
    PageResult selectBlogsByRecommend(PageRequest pageRequest);
}
