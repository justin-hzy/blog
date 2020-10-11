package com.eva.dto;

import java.util.Date;

public class Blog {
    private String id;

    private String title;

    private String content;

    private String firstPicture;

    private String flag;

    private String views;

    private String appreciation;

    private String shareStatement;

    private String commentTabled;

    private String published;

    private String recommend;

    private Date createTime;

    private Date updateTime;

    /*关系对象 begin */
/*    private Type type;

    private List<Tag> tags = new ArrayList<>();

    private User user;

    private List<Comment> comments = new ArrayList<>();*/

    /*关系对象 end */

    /*public User getUser() {
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
    }*/

    public Blog() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFirstPicture() {
        return firstPicture;
    }

    public void setFirstPicture(String firstPicture) {
        this.firstPicture = firstPicture;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getAppreciation() {
        return appreciation;
    }

    public void setAppreciation(String appreciation) {
        this.appreciation = appreciation;
    }

    public String getShareStatement() {
        return shareStatement;
    }

    public void setShareStatement(String shareStatement) {
        this.shareStatement = shareStatement;
    }

    public String getCommentTabled() {
        return commentTabled;
    }

    public void setCommentTabled(String commentTabled) {
        this.commentTabled = commentTabled;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", firstPicture='" + firstPicture + '\'' +
                ", flag='" + flag + '\'' +
                ", views='" + views + '\'' +
                ", appreciation='" + appreciation + '\'' +
                ", shareStatement='" + shareStatement + '\'' +
                ", commentTabled='" + commentTabled + '\'' +
                ", published='" + published + '\'' +
                ", recommend='" + recommend + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
