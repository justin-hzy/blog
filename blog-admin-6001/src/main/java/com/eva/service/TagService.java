package com.eva.service;

import com.eva.dto.Tag;
import com.eva.dto.Type;
import com.eva.utils.PageRequest;
import com.eva.utils.PageResult;

public interface TagService {

    int addTag(Tag tag);

    Tag getTagByTagId(Tag tag);

    int updateTag(Tag tag);

    int deleteTagByTagId(Tag tag);

    PageResult getTagsByPage(PageRequest pageRequest);
}
