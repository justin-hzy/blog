package com.eva.vo;

import com.eva.dto.Comment;
import com.eva.dto.User;

import java.util.List;

public class CommentVo extends Comment {
    List<CommentVo> commentVoList;


    public List<CommentVo> getCommentVoList() {
        return commentVoList;
    }

    public void setCommentVoList(List<CommentVo> commentVoList) {
        this.commentVoList = commentVoList;
    }
}
