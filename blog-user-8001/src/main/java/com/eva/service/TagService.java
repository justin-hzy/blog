package com.eva.service;



import com.eva.dto.Tag;
import com.eva.vo.TagsVo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TagService {
    List<TagsVo> selectTags();
    Tag selectTagById(String tagId);
}
