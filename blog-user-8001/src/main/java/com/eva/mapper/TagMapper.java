package com.eva.mapper;


import com.eva.dto.Tag;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TagMapper {
    List<Tag> selectTag();
    Tag selectTagById(int tag_id);
}
