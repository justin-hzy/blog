package com.eva.service;



import com.eva.dto.Tag;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TagService {
    List<Tag> selectTag();
    Tag selectTagById(int tag_id);
}
