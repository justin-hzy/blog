package com.eva.vo;

import com.eva.dto.Blog;
import com.eva.dto.Tag;
import com.eva.dto.Type;

import java.util.List;

public class BlogsVo extends Blog {
    Type type;
    List<Tag> tags;
}
