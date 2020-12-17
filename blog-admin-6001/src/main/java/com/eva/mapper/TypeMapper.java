package com.eva.mapper;

import com.eva.dto.Type;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeMapper {

    int addType(Type type);

    List<Type> getTypesByPage();

    int updateType(Type type);

    Type getTypeByTypeId(String typeId);

    int deleteTypeByTypeId(Type type);

    List<Type> getTypeByAll();
}
