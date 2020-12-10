package com.eva.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * blog
 * @author 
 */
public class Blog implements Serializable {

    private String blogId;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 用户id
     */
    private String userId;

    private String typeId;

    /**
     * 首图
     */
    private String firstpicture;

    /**
     * 描述
     */
    private String description;

    /**
     * 标记
     */
    private String flag;

    /**
     * 浏览次数
     */
    private Integer views;

    /**
     * 赞赏开启
     */
    private String appreciation;

    /**
     * 版权声明开启
     */
    private String sharestatement;

    /**
     * 评论是否开启
     */
    private String commenttabled;

    /**
     * 是否发布
     */
    private String published;

    /**
     * 是否推荐
     */
    private String recommend;


    private Date createtime;

    private Date updatetime;

    private String deleteFlag;

    private static final long serialVersionUID = 1L;

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getFirstpicture() {
        return firstpicture;
    }

    public void setFirstpicture(String firstpicture) {
        this.firstpicture = firstpicture;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public String getAppreciation() {
        return appreciation;
    }

    public void setAppreciation(String appreciation) {
        this.appreciation = appreciation;
    }

    public String getSharestatement() {
        return sharestatement;
    }

    public void setSharestatement(String sharestatement) {
        this.sharestatement = sharestatement;
    }

    public String getCommenttabled() {
        return commenttabled;
    }

    public void setCommenttabled(String commenttabled) {
        this.commenttabled = commenttabled;
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

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDelete_flag() {
        return deleteFlag;
    }

    public void setDelete_flag(String delete_flag) {
        this.deleteFlag = delete_flag;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogId='" + blogId + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", userId='" + userId + '\'' +
                ", typeId='" + typeId + '\'' +
                ", firstpicture='" + firstpicture + '\'' +
                ", description='" + description + '\'' +
                ", flag='" + flag + '\'' +
                ", views=" + views +
                ", appreciation='" + appreciation + '\'' +
                ", sharestatement='" + sharestatement + '\'' +
                ", commenttabled='" + commenttabled + '\'' +
                ", published='" + published + '\'' +
                ", recommend='" + recommend + '\'' +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                ", delete_flag='" + deleteFlag + '\'' +
                '}';
    }
}