package com.eva.vo;

import com.eva.dto.Blog;
import com.eva.dto.Tag;
import com.eva.dto.Type;

import java.util.List;

public class BlogsVo extends Blog {
    Type type;
    List<Tag> tags;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
