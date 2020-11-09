package com.eva.service.Impl;


import com.eva.dto.Tag;
import com.eva.mapper.TagMapper;
import com.eva.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    TagMapper tagMapper;

    @Override
    public List<Tag> selectTag() {
        return tagMapper.selectTag();
    }

    @Override
    public Tag selectTagById(int tag_id) {
        return tagMapper.selectTagById(tag_id);
    }
}
