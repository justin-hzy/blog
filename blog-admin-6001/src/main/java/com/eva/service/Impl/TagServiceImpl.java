package com.eva.service.Impl;

import com.eva.dto.Tag;
import com.eva.dto.Type;
import com.eva.mapper.AdminMapper;
import com.eva.service.TagService;
import com.eva.utils.PageRequest;
import com.eva.utils.PageResult;
import com.eva.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public int addTag(Type type) {
        return 0;
    }

    @Override
    public Type getTagByTagId(Type type) {
        return null;
    }

    @Override
    public int updateTag(Type type) {
        return 0;
    }

    @Override
    public int deleteTagByTagId(Type type) {
        return 0;
    }

    @Override
    public PageResult getTagsByPage(PageRequest pageRequest) {
        return PageUtils.getPageResult(pageRequest,getPageInfo(pageRequest));
    }

    /**
     * 调用分页插件完成分页
     * @param pageRequest
     * @return
     */
    private PageInfo<Tag> getPageInfo(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<Tag> tagList = adminMapper.getTagsByPage();
        System.out.println("typeList.toString()="+tagList.toString());
        return new PageInfo<Tag>(tagList);
    }
}
