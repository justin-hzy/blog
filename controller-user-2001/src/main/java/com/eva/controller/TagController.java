package com.eva.controller;


import com.eva.service.FeignService;
import com.eva.utils.JSONResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tags")
public class TagController {


    private static final Logger logger = LoggerFactory.getLogger(BlogController.class);


    @Autowired
    private FeignService feignService;

    @PostMapping(value = "/selectTags")
    public JSONResult selectTypes(){
        logger.info("进入selectTags");
        JSONResult jsonResult = feignService.selectTags();

        return jsonResult;
    }
}
