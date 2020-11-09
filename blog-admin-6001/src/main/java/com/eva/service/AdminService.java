package com.eva.service;

import com.eva.dto.User;
import org.springframework.stereotype.Service;


public interface AdminService {

    User checkUser (String username,String password);

    User selectUser();

    User getUser(User user);
}
