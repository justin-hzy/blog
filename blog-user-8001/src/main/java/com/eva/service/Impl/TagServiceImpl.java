package com.eva.service.Impl;


import com.eva.dto.Tag;
import com.eva.mapper.TagMapper;
import com.eva.service.TagService;
import com.eva.vo.TagsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    TagMapper tagMapper;

    @Override
    public List<TagsVo> selectTags() {
        return tagMapper.selectTags();
    }

    @Override
    public Tag selectTagById(String tagId) {
        return tagMapper.selectTagById(tagId);
    }
}
