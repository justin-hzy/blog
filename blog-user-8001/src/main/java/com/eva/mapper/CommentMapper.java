package com.eva.mapper;


import com.eva.dto.Comment;
import com.eva.vo.CommentVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentMapper {
    List<Comment> selectComments(@Param("blog_id")String blogId);

}
