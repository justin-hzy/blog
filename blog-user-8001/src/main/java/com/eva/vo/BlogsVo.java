package com.eva.vo;

import com.eva.dto.Blog;
import com.eva.dto.Tag;
import com.eva.dto.Type;
import com.eva.dto.User;

import java.util.List;

public class BlogsVo extends Blog {
    User user;
    Type type;
    List<Tag> tags;

    public BlogsVo() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

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
