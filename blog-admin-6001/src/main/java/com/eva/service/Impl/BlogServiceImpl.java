package com.eva.service.Impl;

import com.eva.dto.Blog;
import com.eva.dto.Tag;
import com.eva.dto.Type;
import com.eva.mapper.BlogMapper;
import com.eva.service.BlogService;
import com.eva.utils.PageRequest;
import com.eva.utils.PageResult;
import com.eva.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.logging.SimpleFormatter;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Transactional
    @Override
    public PageResult getBlogsByPage(PageRequest pageRequest) {
        return PageUtils.getPageResult(pageRequest,getPageInfo(pageRequest));
    }

    @Override
    public int addBlog(Blog blog) {
        blog.setBlogId(UUID.randomUUID().toString().replace("-",""));
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        blog.setCreatetime(new Date());
        blog.setUpdatetime(new Date());
        return blogMapper.addBlog(blog);
    }

    @Override
    public Blog getBlogByBlogId(Blog blog) {
        return blogMapper.getBlogByBlogId(blog);
    }

    @Override
    public int updateBlog(Blog blog) {
        return blogMapper.updateBlog(blog);
    }

    @Override
    public int deleteBlogByBlogId(Blog blog) {
        return blogMapper.deleteBlogByBlogId(blog);
    }

    /**
     * 调用分页插件完成分页
     * @param pageRequest
     * @return
     */
    private PageInfo<Blog> getPageInfo(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<Blog> blogList = blogMapper.getBlogsByPage();
        System.out.println("blogList.toString()="+blogList.toString());
        return new PageInfo<Blog>(blogList);
    }
}
