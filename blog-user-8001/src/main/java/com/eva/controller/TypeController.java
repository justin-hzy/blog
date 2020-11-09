package com.eva.controller;



import com.eva.dto.Type;
import com.eva.service.Impl.TypeServiceImpl;
import com.eva.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/types")
public class TypeController {

    @Autowired
    TypeService typeService;

    @RequestMapping(value = "/selectType")
    public List<Type> selectType(){
        List<Type> result = typeService.selectType();
        return result;
    }

    @RequestMapping(value = "/selectTypeById")
    public Type selectTypeById(int type_id){
        Type result = typeService.selectTypeById(type_id);
        return result;
    }
}
