package com.eva.controller;


import com.eva.service.Impl.CommentServiceImpl;
import com.eva.vo.CommentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    CommentServiceImpl commentService;

    @RequestMapping("selectCommentsByBlogId")
    public List selectCommentsByBlogId(@RequestParam("blogId") String blogId){
        return commentService.selectComments(blogId);
    }
}
