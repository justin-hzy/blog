package com.eva.mapper;

import com.eva.dto.Tag;
import com.eva.dto.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface AdminMapper {

    User selectUser();

    User findByUsernameAndPassword(Map map);

    User getUser(User user);
}
