package com.eva.controller;

import com.eva.dto.Type;
import com.eva.service.TypeService;
import com.eva.utils.JSONResult;
import com.eva.utils.PageRequest;
import com.eva.utils.PageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("admin")
public class TypeController {

    private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    private TypeService typeService;

    @PostMapping("data/addType")
    public JSONResult addType(@RequestBody Type type){
        logger.info("进入addType");
        String uuId = UUID.randomUUID().toString().replace("-","");
        type.setTypeId(uuId);
        logger.info(type.toString());
        int flag = typeService.addType(type);
        if (flag==1){
            return JSONResult.build(200,"提交成功",null);
        }else{
            return JSONResult.build(500,"提交失败",null);
        }
    }

    @PostMapping("/getTypeByPage")
    public JSONResult getTypeByPage(@RequestBody PageRequest pageRequest ){
        logger.info("进入getTypeByPage");
        PageResult pageResult = typeService.getTypeByPage(pageRequest);
        if (pageResult!=null){
            return JSONResult.build(200,"查询分页成功",pageResult);
        }else{
            return JSONResult.build(500,"查询分页失败",null);
        }
    }

    @PostMapping("/getTypeByTypeId")
    public JSONResult getTypeByTypeId(@RequestBody Type type){
        logger.info("getTypeByTypeId");
        Type type1 = typeService.getTypeByTypeId(type);
        if (type1!=null){
            return JSONResult.build(200,"查询成功",type1);
        }else{
            return JSONResult.build(500,"查询失败",null);
        }
    }

    @PostMapping("data/updateType")
    public JSONResult updateType(@RequestBody Type type){
        logger.info("执行updateType方法");
        int flag = typeService.updateType(type);
        if (flag==1){
            return JSONResult.build(200,"更新成功",null);
        }else{
            return JSONResult.build(500,"更新失败",null);
        }
    }

    @PostMapping("data/deleteTypeByTypeId")
    public JSONResult deleteTypeByTypeId(@RequestBody Type type){
        logger.info("执行deleteTypeByTypeId方法");
        int flag = typeService.deleteTypeByTypeId(type);
        if (flag==1){
            return JSONResult.build(200,"删除成功",null);
        }else{
            return JSONResult.build(500,"删除失败",null);
        }
    }
}
