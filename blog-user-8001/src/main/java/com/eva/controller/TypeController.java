package com.eva.controller;



import com.eva.dto.Type;
import com.eva.service.Impl.TypeServiceImpl;
import com.eva.service.TypeService;
import com.eva.utils.JSONResult;
import com.eva.vo.TypesVo;
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

    @RequestMapping(value = "/selectTypes")
    public JSONResult selectTypes(){
        List<TypesVo> result = typeService.selectTypes();
        if(result!=null){
            return JSONResult.build(200,"",result);
        }else{
            return JSONResult.build(500,"",null);
        }
    }

    @RequestMapping(value = "/selectTypeById")
    public JSONResult selectTypeById(String typeId){
        Type result = typeService.selectTypeById(typeId);
        if(result!=null){
            return JSONResult.build(200,"",result);
        }else{
            return JSONResult.build(500,"",null);
        }
    }
}
