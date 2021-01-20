package com.eva.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.eva.dto.Blog;
import com.eva.dto.Type;
import com.eva.mapper.BlogMapper;
import com.eva.service.BlogService;
import com.eva.utils.PageRequest;
import com.eva.utils.PageResult;
import com.eva.utils.PageUtils;
import com.eva.vo.BlogsVo;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class BlogServiceImpl implements BlogService {


    @Autowired
    private BlogMapper blogMapper;

    @Resource(name = "myRedisTemplate")
    private RedisTemplate redisTemplate;

    @Override
    public PageResult selectBlogs(PageRequest pageRequest){
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<BlogsVo> blogsVoList =blogMapper.selectBlogs();

        if (blogsVoList!=null & blogsVoList.size()>0){
            System.out.println("size : "+redisTemplate.opsForHash().size("blog"));
            for (BlogsVo blog:blogsVoList){
                Map<String,BlogsVo> map=new HashMap<String,BlogsVo>();
                map.put(blog.getBlogId(),blog);
                redisTemplate.opsForHash().put("blog",blog.getBlogId(), JSONObject.toJSON(blog));
//                Object jsonstr=  redisTemplate.opsForHash().get("blog",blog.getBlogId());
//                BlogsVo b =JSONObject.parseObject(jsonstr.toString(),BlogsVo.class);
//                System.out.println(b);
            }
        }
        return PageUtils.getPageResult(pageRequest,new PageInfo<BlogsVo>(blogsVoList));
    };

    @Override
    public Blog selectBlogByID(String blogId){
        Blog result =blogMapper.selectBlogByID(blogId);
        return result;
    };
    @Override
    public PageResult  selectBlogsByType(String typeId,PageRequest pageRequest){
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<BlogsVo> result =blogMapper.selectBlogsByType( typeId);
        return PageUtils.getPageResult(pageRequest,new PageInfo<BlogsVo>(result));
    };
    @Override
    public PageResult selectBlogsByTag(String tagId,PageRequest pageRequest){
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<BlogsVo> result =blogMapper.selectBlogsByTag(tagId);
        return PageUtils.getPageResult(pageRequest,new PageInfo<BlogsVo>(result));
    };

    @Override
    public PageResult selectBlogsByRecommend(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<BlogsVo> result =blogMapper.selectBlogsByRecommend();
        return PageUtils.getPageResult(pageRequest,new PageInfo<BlogsVo>(result));
    };
}
