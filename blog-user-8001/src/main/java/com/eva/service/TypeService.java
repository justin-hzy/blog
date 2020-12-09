package com.eva.service;


import com.eva.dto.Type;
import com.eva.vo.TypesVo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public interface TypeService {

    List<TypesVo> selectTypes();
    Type selectTypeById(String typeId);
}
