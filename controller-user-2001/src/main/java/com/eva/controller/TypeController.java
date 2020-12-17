package com.eva.controller;


import com.eva.service.FeignService;
import com.eva.utils.JSONResult;
import com.eva.utils.PageRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/types")
public class TypeController {

    private static final Logger logger = LoggerFactory.getLogger(BlogController.class);


    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "/selectTypes")
    public JSONResult selectTypes(PageRequest pageRequest){
        logger.info("进入selectTypes");
        JSONResult jsonResult = feignService.selectTypes(pageRequest);

        return jsonResult;
    }
}
