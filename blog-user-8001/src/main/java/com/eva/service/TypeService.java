package com.eva.service;


import com.eva.dto.Type;
import com.eva.utils.PageRequest;
import com.eva.utils.PageResult;
import com.eva.vo.TypesVo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public interface TypeService {

    PageResult selectTypes(PageRequest pageRequest);
    Type selectTypeById(String typeId);
}
