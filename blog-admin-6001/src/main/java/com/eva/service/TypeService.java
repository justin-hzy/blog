package com.eva.service;

import com.eva.dto.Type;

public interface TypeService {

    int addType(Type type);

    Type getType(Long id);

    Type updateType(Long id,Type type);

    int deleteType(Type type);

}
