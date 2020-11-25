package com.eva.dto;

import java.io.Serializable;

/**
 * tag
 * @author 
 */
public class Tag implements Serializable {
    private String tagId;

    private String tagName;

    private String deleteFlag;

    private static final long serialVersionUID = 1L;

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String id) {
        this.tagId = id;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String name) {
        this.tagName = name;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tagId=").append(tagId);
        sb.append(", tagName=").append(tagName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}