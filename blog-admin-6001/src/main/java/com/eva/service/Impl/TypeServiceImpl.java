package com.eva.service.Impl;

import com.eva.dto.Type;
import com.eva.mapper.AdminMapper;
import com.eva.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private AdminMapper adminMapper;

    @Transactional
    @Override
    public int addType(Type type) {
        return 0;
    }

    @Transactional
    @Override
    public Type getType(Long id) {
        return null;
    }

    @Transactional
    @Override
    public Type updateType(Long id, Type type) {
        return null;
    }

    @Transactional
    @Override
    public int deleteType(Type type) {
        return 0;
    }
}
