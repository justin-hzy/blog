package com.eva.vo;

import com.eva.dto.Blog;

public class BlogVo extends Blog {

    private String typeId;

    private String typeName;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String getTypeId() {
        return typeId;
    }

    @Override
    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }
}
