package com.eva.mapper;


import com.eva.vo.CommentVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentMapper {
    List<CommentVo> selectCommentVo(@Param("blog_id")String blogId);

}
