package com.eva.controller;

import com.eva.dto.Tag;
import com.eva.service.TagService;
import com.eva.utils.JSONResult;
import com.eva.utils.PageRequest;
import com.eva.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class TagController {

    @Autowired
    private TagService tagService;

    @PostMapping("/getTagsByPage")
    public JSONResult getTagsByPage(@RequestBody PageRequest pageRequest){
        PageResult pageResult = tagService.getTagsByPage(pageRequest);
        if (pageResult!=null){
            return JSONResult.build(200,"查询分页成功",pageResult);
        }else{
            return JSONResult.build(500,"查询分页失败",null);
        }
    }

    @PostMapping("/getTagByTagId")
    public JSONResult getTagByTagId(@RequestBody Tag tag){
        Tag tag1 = tagService.getTagByTagId(tag);
        if (tag1!=null){
            return JSONResult.build(200,"查询成功",tag1);
        }else{
            return JSONResult.build(500,"查询失败",null);
        }
    }

    @PostMapping("data/updateTag")
    public JSONResult updateTag(@RequestBody Tag tag){
        int flag = tagService.updateTag(tag);
        if (flag == 1){
            return JSONResult.build(200,"更新成功",null);
        }else{
            return JSONResult.build(500,"更新失败",null);
        }
    }

    @PostMapping("data/addTag")
    public JSONResult addTag(@RequestBody Tag tag){
        int flag = tagService.addTag(tag);
        if (flag == 1){
            return JSONResult.build(200,"插入成功",null);
        }else{
            return JSONResult.build(500,"插入失败",null);
        }
    }

    @PostMapping("data/deleteTagByTagId")
    public JSONResult deleteTagByTagId(@RequestBody Tag tag){
        int flag = tagService.deleteTagByTagId(tag);
        if (flag == 1){
            return JSONResult.build(200,"插入成功",null);
        }else{
            return JSONResult.build(500,"插入失败",null);
        }
    }
}
