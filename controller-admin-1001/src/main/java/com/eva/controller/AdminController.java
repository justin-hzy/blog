package com.eva.controller;

import com.eva.dto.Type;
import com.eva.dto.User;
import com.eva.service.FeignService;
import com.eva.utils.JSONResult;
import com.eva.utils.JwtUtil;
import com.eva.utils.PageRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        logger.info("----------------------------------------");
        JSONResult jsonResult = feignService.addType(type);
        return jsonResult;
    }

    @PostMapping("/getTypeByPage")
    public JSONResult getTypeByPage(PageRequest pageRequest ){
        logger.info("进入getTypeByPage");
        JSONResult jsonResult = feignService.getTypeByPage(pageRequest);
        return jsonResult;
    }
}
