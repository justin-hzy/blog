package com.eva.mapper;

import com.eva.dto.Tag;
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

    int addTag(Tag tag);

    List<Tag> getTagsByPage();

    int updateTag(Tag tag);

    Tag getTagByTagId(String typeId);

    int deleteTagByTagId(Type type);
}
