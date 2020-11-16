package com.eva.service;

import com.eva.dto.Type;
import com.eva.utils.PageRequest;

public interface TypeService {

    int addType(Type type);

    Type getType(Long id);

    Type updateType(Long id,Type type);

    int deleteType(Type type);

    Type getTypeByPage(PageRequest pageQuery);
}
