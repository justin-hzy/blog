package com.eva.service;

import com.eva.dto.User;
import org.springframework.stereotype.Service;


public interface UserService {

    User checkUser (String username,String password);

    User selectUser();
}
