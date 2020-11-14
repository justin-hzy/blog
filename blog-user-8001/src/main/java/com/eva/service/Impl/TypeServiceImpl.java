package com.eva.service.Impl;


import com.eva.dto.Type;
import com.eva.mapper.TypeMapper;
import com.eva.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {


    @Autowired
    TypeMapper typeMapper;

    @Override
    public List<Type> selectTypes() {
        return typeMapper.selectTypes();
    }

    @Override
    public Type selectTypeById(String typeId) {
        return typeMapper.selectTypeById(typeId);
    }
}
