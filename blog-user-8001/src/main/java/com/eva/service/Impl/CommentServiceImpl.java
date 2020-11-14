package com.eva.service.Impl;

import com.eva.mapper.CommentMapper;
import com.eva.service.CommentService;
import com.eva.vo.CommentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentMapper commentMapper;



    @Override
    public List<CommentVo> selectCommentVo(String blogId) {
        return commentMapper.selectCommentVo(blogId);
    }
}
