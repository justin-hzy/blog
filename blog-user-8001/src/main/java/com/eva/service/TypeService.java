package com.eva.service;


import com.eva.dto.Type;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public interface TypeService {

    List<Type> selectTypes();
    Type selectTypeById(String typeId);
}
