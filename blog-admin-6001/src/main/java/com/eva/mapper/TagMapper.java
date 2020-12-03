package com.eva.mapper;

import com.eva.dto.Tag;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagMapper {

    int addTag(Tag tag);

    List<Tag> getTagsByPage();

    int updateTag(Tag tag);

    Tag getTagByTagId(Tag tag);

    int deleteTagByTagId(Tag tag);
}
