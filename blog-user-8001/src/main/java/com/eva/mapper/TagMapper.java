package com.eva.mapper;


import com.eva.dto.Tag;
import com.eva.vo.TagsVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TagMapper {
    List<TagsVo> selectTags();
    Tag selectTagById(@Param("tag_id") String tagId);
}
