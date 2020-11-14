package com.eva.mapper;


import com.eva.dto.Tag;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TagMapper {
    List<Tag> selectTags();
    Tag selectTagById(@Param("tag_id") String tagId);
}
