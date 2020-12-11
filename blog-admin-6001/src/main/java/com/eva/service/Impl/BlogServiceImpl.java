package com.eva.service.Impl;

import com.eva.controller.AdminController;
import com.eva.dto.Blog;
import com.eva.dto.Tag;
import com.eva.dto.Type;
import com.eva.mapper.BlogMapper;
import com.eva.service.BlogService;
import com.eva.utils.PageRequest;
import com.eva.utils.PageResult;
import com.eva.utils.PageUtils;
import com.eva.utils.SerializeUtil;
import com.eva.vo.BlogVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.SimpleFormatter;

@Service
public class BlogServiceImpl implements BlogService {

    private static final Logger logger = LoggerFactory.getLogger(BlogServiceImpl.class);

    @Autowired
    private BlogMapper blogMapper;

    @Resource(name = "myRedisTemplate")
    private RedisTemplate redisTemplate;

    @Transactional
    @Override
    public PageResult getBlogsByPage(PageRequest pageRequest) {
        return PageUtils.getPageResult(pageRequest,getPageInfo(pageRequest));
    }

    @Transactional
    @Override
    public int addBlog(Blog blog) {
        blog.setBlogId(UUID.randomUUID().toString().replace("-",""));
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        blog.setCreatetime(new Date());
        blog.setUpdatetime(new Date());
        int result = blogMapper.addBlog(blog);
        if(result==1){
            redisTemplate.opsForHash().put("blog",blog.getBlogId(),blog.toString());
            Blog blog1 = (Blog) redisTemplate.opsForHash().get("blog",blog.getBlogId());
            if (blog1!=null){
                logger.info("缓存同步成功");
            }else {
                logger.info("缓存同步失败");
            }
        }
        return result;
    }

    @Transactional
    @Override
    public Blog getBlogByBlogId(Blog blog) {
        return blogMapper.getBlogByBlogId(blog);
    }

    @Transactional
    @Override
    public int updateBlog(Blog blog) {

        int result = blogMapper.updateBlog(blog);
        if (result==1){
            Blog blog1 = getBlogByBlogId(blog);
            redisTemplate.opsForHash().put("blog",blog1.getBlogId(),blog1.toString());
            /*try {
                redisTemplate.multi();
                redisTemplate.opsForHash().delete("blog");
                redisTemplate.opsForHash().put("blog",blog1.getBlogId(),blog1.toString());
                int i = 1/0;
                redisTemplate.exec();
            }catch (Exception e){
                redisTemplate.discard();
            }*/
        }
        return result;
    }

    @Transactional
    @Override
    public int deleteBlogByBlogId(Blog blog) {
        int result = blogMapper.deleteBlogByBlogId(blog);
        if(result==1){
            redisTemplate.opsForHash().put("blog",blog.getBlogId(),blog.toString());
            Blog blog1 = (Blog) redisTemplate.opsForHash().get("blog",blog.getBlogId());
            if (blog1!=null){
                logger.info("缓存同步成功");
            }else {
                logger.info("缓存同步失败");
            }
        }
        return blogMapper.deleteBlogByBlogId(blog);
    }

    @Transactional
    @Override
    public boolean getBlogByAll() {
        List<Blog> blogList = blogMapper.getBlogByAll();
        if (blogList!=null){
            for (Blog blog:blogList){
                Map<String,Blog> map=new HashMap<String,Blog>();
                map.put(blog.getBlogId(),blog);
                redisTemplate.opsForHash().put("blog",blog.getBlogId(), blog.toString());
                /*System.out.println(redisTemplate.opsForHash().get("blog",'1'));*/
            }
            return true;
        }else {
            return false;
        }
    }

    @Override
    public PageResult search(String title, String typeId, String recommend, PageRequest pageRequest) {
        return PageUtils.getPageResult(pageRequest,getPageInfo(title,typeId,recommend,pageRequest));
    }

    /**
     * 调用分页插件完成分页
     * @param pageRequest
     * @return
     */
    private PageInfo<BlogVo> getPageInfo(String title,String typeId,String recommend,PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<BlogVo> blogVoList = blogMapper.search(title,typeId,recommend);
        System.out.println("blogVoList.toString()="+blogVoList.toString());
        return new PageInfo<BlogVo>(blogVoList);
    }

    /**
     * 调用分页插件完成分页
     * @param pageRequest
     * @return
     */
    private PageInfo<BlogVo> getPageInfo(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<BlogVo> blogVoList = blogMapper.getBlogsByPage();
        System.out.println("blogVoList.toString()="+blogVoList.toString());
        return new PageInfo<BlogVo>(blogVoList);
    }



}
