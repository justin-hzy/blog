package com.eva.mapper;

import com.eva.dto.User;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UserMapper {

    User selectUser();

    User findByUsernameAndPassword(Map map);
}
