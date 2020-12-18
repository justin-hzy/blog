package com.eva.controller;

import com.eva.dto.Tag;
import com.eva.dto.Type;
import com.eva.dto.User;
import com.eva.service.FeignService;
import com.eva.utils.JSONResult;
import com.eva.utils.JwtUtil;
import com.eva.utils.PageRequest;
import com.eva.utils.PageResult;
import feign.Body;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("admin")
public class AdminController {

    private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    private FeignService feignService;

    @PostMapping("getUser")
    public JSONResult getUser(HttpServletRequest request,User user){
        boolean verity = JwtUtil.verity(request.getHeader("token"));
        /*User result = feignService.getUser(user);*/
        if (verity){
            String username  = user.getUsername();
            System.out.println("通过验证");
            return JSONResult.build(200,"验证成功",username);
        }else{
            System.out.println("通过验证");
            return JSONResult.build(404,"验证失败",null);
        }
    }

    @PostMapping("getToken")
    public JSONResult getToken(){
        JSONResult jsonResult = feignService.getToken();
        return jsonResult;
    }

    @PostMapping("data/addType")
    public JSONResult addType(Type type){
        logger.info("进入addType");
        logger.info(type.toString());
        JSONResult jsonResult = feignService.addType(type);
        return jsonResult;
    }

    @PostMapping("/getTypeByPage")
    public JSONResult getTypeByPage(PageRequest pageRequest ){
        logger.info("进入getTypeByPage");
        JSONResult jsonResult = feignService.getTypeByPage(pageRequest);
        return jsonResult;
    }

    @PostMapping("/getTypeByTypeId")
    public JSONResult getTypeByTypeId(Type type){
        logger.info("进入getTypeByTypeId");
        JSONResult jsonResult = feignService.getTypeByTypeId(type);
        return jsonResult;
    }

    @PostMapping("data/updateType")
    public JSONResult updateType(@RequestBody Type type){
        logger.info("进入updateType");
        JSONResult jsonResult  = feignService.updateType(type);
        return jsonResult;
    }

    @PostMapping("data/deleteTypeByTypeId")
    public JSONResult deleteTypeByTypeId(Type type){
        logger.info("进入deleteTypeByTypeId");
        JSONResult jsonResult  = feignService.deleteTypeByTypeId(type);
        return jsonResult;
    }

    @PostMapping("/getTagsByPage")
    public JSONResult getTagsByPage(PageRequest pageRequest){
        logger.info("进入getTagsByPage");
        JSONResult jsonResult = feignService.getTagsByPage(pageRequest);
        return jsonResult;
    }

    @PostMapping("/getTagByTagId")
    public JSONResult getTagByTagId(Tag tag){
        logger.info("进入getTagByTagId");
        JSONResult jsonResult = feignService.getTagByTagId(tag);
        return jsonResult;
    }

    @PostMapping("data/updateTag")
    public JSONResult updateTag(@RequestBody Tag tag){
        logger.info("进入updateTag");
        JSONResult jsonResult = feignService.updateTag(tag);
        return jsonResult;
    }

    @PostMapping("data/addTag")
    public JSONResult addTag(Tag tag){
        logger.info("进入addTag");
        JSONResult jsonResult = feignService.addTag(tag);
        return jsonResult;
    }

    @PostMapping("data/deleteTagByTagId")
    public JSONResult deleteTagByTagId(Tag tag){
        logger.info("进入deleteTagByTagId");
        JSONResult jsonResult = feignService.deleteTagByTagId(tag);
        return jsonResult;
    }

    @PostMapping("/getTypeByAll")
    public JSONResult getTypeByAll(){
        logger.info("进入getTypeByAll");
        JSONResult jsonResult = feignService.getTypeByAll();
        return jsonResult;
    }
}
