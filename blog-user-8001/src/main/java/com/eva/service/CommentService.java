package com.eva.service;


import com.eva.vo.CommentVo;

import java.util.List;

public interface CommentService {
    List<CommentVo> selectCommentVo(String blogId);
}
