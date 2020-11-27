package com.eva.controller;


import com.eva.dto.Tag;
import com.eva.service.Impl.TagServiceImpl;

import com.eva.service.TagService;

import com.eva.utils.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tags")
public class TagsController {


    @Autowired
    TagService tagService;

    @RequestMapping(value = "/selectTags")
    public JSONResult selectTag(){
        List<Tag> result = tagService.selectTags();
        if(result!=null){
            return JSONResult.build(200,"",result);
        }else{
            return JSONResult.build(500,"",null);
        }
    }

    @RequestMapping(value = "/selectTagById")
    public JSONResult selectTagById(String tagId){
        Tag result = tagService.selectTagById(tagId);
        if(result!=null){
            return JSONResult.build(200,"",result);
        }else{
            return JSONResult.build(500,"",null);
        }
    }
}
