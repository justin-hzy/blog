package com.eva.service;



import com.eva.dto.Tag;
import com.eva.utils.PageRequest;
import com.eva.utils.PageResult;
import com.eva.vo.TagsVo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TagService {
    PageResult selectTags(PageRequest pageRequest);
    Tag selectTagById(String tagId);
}
