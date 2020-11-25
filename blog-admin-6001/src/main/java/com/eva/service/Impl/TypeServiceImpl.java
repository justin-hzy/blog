package com.eva.service.Impl;

import com.eva.dto.Type;
import com.eva.mapper.AdminMapper;
import com.eva.service.TypeService;
import com.eva.utils.PageRequest;
import com.eva.utils.PageResult;
import com.eva.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private AdminMapper adminMapper;

    @Transactional
    @Override
    public int addType(Type type) {
        int flag = adminMapper.addType(type);
        return flag;
    }

    @Transactional
    @Override
    public Type getTypeByTypeId(Type type) {
        return adminMapper.getTypeByTypeId(type.getTypeId());
    }

    @Transactional
    @Override
    public int updateType(Type type) {
        return adminMapper.updateType(type);
    }

    @Transactional
    @Override
    public int deleteTypeByTypeId(Type type) {
        return adminMapper.deleteTypeByTypeId(type);
    }

    @Transactional
    @Override
    public PageResult getTypeByPage(PageRequest pageRequest) {
        return PageUtils.getPageResult(pageRequest,getPageInfo(pageRequest));
    }

    /**
     * 调用分页插件完成分页
     * @param pageRequest
     * @return
     */
    private PageInfo<Type> getPageInfo(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<Type> typeList = adminMapper.getTypesByPage();
        /*System.out.println("typeList.toString()="+typeList.toString());*/
        return new PageInfo<Type>(typeList);
    }
}
