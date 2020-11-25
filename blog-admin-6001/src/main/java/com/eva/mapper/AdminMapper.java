package com.eva.mapper;

import com.eva.dto.Type;
import com.eva.dto.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface AdminMapper {

    User selectUser();

    User findByUsernameAndPassword(Map map);

    User getUser(User user);

    int addType(Type type);

    List<Type> getTypesByPage();

    int updateType(Type type);

    Type getTypeByTypeId(String typeId);

    int deleteTypeByTypeId(Type type);
}
