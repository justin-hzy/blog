package com.eva.service.Impl;


import com.eva.dto.Tag;
import com.eva.mapper.TagMapper;
import com.eva.service.TagService;
import com.eva.utils.PageRequest;
import com.eva.utils.PageResult;
import com.eva.utils.PageUtils;
import com.eva.vo.BlogsVo;
import com.eva.vo.TagsVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    TagMapper tagMapper;

    @Override
    public PageResult selectTags(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        return PageUtils.getPageResult(pageRequest,new PageInfo<TagsVo>(tagMapper.selectTags()));
    }

    @Override
    public Tag selectTagById(String tagId) {
        return tagMapper.selectTagById(tagId);
    }
}
