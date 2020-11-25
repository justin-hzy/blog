package com.eva.service;

import com.eva.dto.Type;
import com.eva.utils.PageRequest;
import com.eva.utils.PageResult;

public interface TypeService {

    int addType(Type type);

    Type getTypeByTypeId(Type type);

    int updateType(Type type);

    int deleteTypeByTypeId(Type type);

    PageResult getTypeByPage(PageRequest pageQuery);
}
