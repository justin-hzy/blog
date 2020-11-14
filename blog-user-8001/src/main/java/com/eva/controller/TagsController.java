package com.eva.controller;


import com.eva.dto.Tag;
import com.eva.service.Impl.TagServiceImpl;

import com.eva.service.TagService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tags")
public class TagsController {


    @Autowired
    TagService tagService;

    @RequestMapping(value = "/selectTag")
    public List<Tag> selectTag(){
        List<Tag> result = tagService.selectTags();
        return result;
    }

    @RequestMapping(value = "/selectTagById")
    public Tag selectTagById(String tagId){
        Tag result = tagService.selectTagById(tagId);
        return result;
    }
}
