package com.eva.service;

import com.eva.dto.Type;
import com.eva.utils.PageRequest;
import com.eva.utils.PageResult;

public interface TagService {

    int addTag(Type type);

    Type getTagByTagId(Type type);

    int updateTag(Type type);

    int deleteTagByTagId(Type type);

    PageResult getTagsByPage(PageRequest pageRequest);
}
