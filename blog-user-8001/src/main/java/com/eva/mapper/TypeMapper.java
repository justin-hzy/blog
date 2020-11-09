package com.eva.mapper;


import com.eva.dto.Type;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeMapper {

    List<Type> selectType();
    Type selectTypeById(@Param("type_id") int type_id);
}
