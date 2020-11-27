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
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private AdminMapper adminMapper;

    @Transactional
    @Override
    public int addTag(Tag tag) {

        tag.setTagId(UUID.randomUUID().toString().replace("-",""));
        return adminMapper.addTag(tag);
    }

    @Transactional
    @Override
    public Tag getTagByTagId(Tag tag) {
        return adminMapper.getTagByTagId(tag);
    }

    @Transactional
    @Override
    public int updateTag(Tag tag) {
        return adminMapper.updateTag(tag);
    }

    @Transactional
    @Override
    public int deleteTagByTagId(Tag tag) {
        return adminMapper.deleteTagByTagId(tag);
    }

    @Transactional
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
