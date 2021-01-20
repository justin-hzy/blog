package com.eva.service.Impl;


import com.eva.dto.Type;
import com.eva.mapper.TypeMapper;
import com.eva.service.TypeService;
import com.eva.utils.PageRequest;
import com.eva.utils.PageResult;
import com.eva.utils.PageUtils;
import com.eva.vo.TagsVo;
import com.eva.vo.TypesVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {


    @Autowired
    TypeMapper typeMapper;

    @Override
    public PageResult selectTypes(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        return PageUtils.getPageResult(pageRequest,new PageInfo<TypesVo>(typeMapper.selectTypes()));
    }

    @Override
    public Type selectTypeById(String typeId) {
        return typeMapper.selectTypeById(typeId);
    }
}
