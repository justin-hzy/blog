package com.eva.service.Impl;


import com.eva.dto.Type;
import com.eva.mapper.TypeMapper;
import com.eva.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TypeServiceImpl implements TypeService {


    @Autowired
    TypeMapper typeMapper;

    @Override
    public List<Type> selectType() {
        return typeMapper.selectType();
    }

    @Override
    public Type selectTypeById(int type_id) {
        return typeMapper.selectTypeById(type_id);
    }
}
