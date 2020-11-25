package com.eva.service.Impl;

import com.eva.dto.Comment;
import com.eva.mapper.CommentMapper;
import com.eva.service.CommentService;
import com.eva.vo.CommentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentMapper commentMapper;



    @Override
    public List selectComments(String blogId) {
        List<Comment>  list =commentMapper.selectComments(blogId);
        List<Comment>  list1 = new ArrayList<>();
        List<Comment>  list2 = new ArrayList<>();
        List  list3 = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            Comment comment1 =list.get(i);
            if(comment1.getParentcommentId()!=null& !"".equals(comment1.getParentcommentId())){
                list2.add(comment1);
            }else {
                list1.add(comment1);
            }
        }

        list3.add(list1);
        list3.add(list2);
        return list3;
    }


}
