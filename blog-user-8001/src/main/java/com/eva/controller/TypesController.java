package com.eva.controller;



import com.eva.dto.Type;
import com.eva.service.Impl.TypeServiceImpl;
import com.eva.service.TypeService;
import com.eva.utils.JSONResult;
import com.eva.utils.PageRequest;
import com.eva.utils.PageResult;
import com.eva.vo.TypesVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/types")
public class TypesController {

    @Autowired
    TypeService typeService;

    @RequestMapping(value = "/selectTypes")
    public JSONResult selectTypes(@RequestBody PageRequest pageRequest){
        PageResult result = typeService.selectTypes(pageRequest);
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
