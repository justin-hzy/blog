package com.eva.service;

import com.eva.dto.Type;
import com.eva.utils.PageRequest;
import com.eva.utils.PageResult;

public interface TypeService {

    int addType(Type type);

    Type getType(Long id);

    Type updateType(Long id,Type type);

    int deleteType(Type type);

    PageResult getTypeByPage(PageRequest pageQuery);
}
