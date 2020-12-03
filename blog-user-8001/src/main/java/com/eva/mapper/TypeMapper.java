package com.eva.mapper;


import com.eva.dto.Type;
import com.eva.vo.TypesVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeMapper {

    List<TypesVo> selectTypes();
    Type selectTypeById(@Param("type_id") String typeId);
}
