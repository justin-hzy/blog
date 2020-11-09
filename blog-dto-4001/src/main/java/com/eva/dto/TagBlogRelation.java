package com.eva.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * blog
 * @author 
 */
public class TagBlogRelation implements Serializable {
    private Integer id;

    private String title;

    private String content;

    private Integer commentId;

    private Integer typeId;

    private String firstpicture;

    private String flag;

    private String views;

    private String appreciation;

    private String sharestatement;

    private String commenttabled;

    private String published;

    private String recommend;

    private Date createtime;

    private Date updatetime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
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

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TagBlogRelation other = (TagBlogRelation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getCommentId() == null ? other.getCommentId() == null : this.getCommentId().equals(other.getCommentId()))
            && (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
            && (this.getFirstpicture() == null ? other.getFirstpicture() == null : this.getFirstpicture().equals(other.getFirstpicture()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getViews() == null ? other.getViews() == null : this.getViews().equals(other.getViews()))
            && (this.getAppreciation() == null ? other.getAppreciation() == null : this.getAppreciation().equals(other.getAppreciation()))
            && (this.getSharestatement() == null ? other.getSharestatement() == null : this.getSharestatement().equals(other.getSharestatement()))
            && (this.getCommenttabled() == null ? other.getCommenttabled() == null : this.getCommenttabled().equals(other.getCommenttabled()))
            && (this.getPublished() == null ? other.getPublished() == null : this.getPublished().equals(other.getPublished()))
            && (this.getRecommend() == null ? other.getRecommend() == null : this.getRecommend().equals(other.getRecommend()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getCommentId() == null) ? 0 : getCommentId().hashCode());
        result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
        result = prime * result + ((getFirstpicture() == null) ? 0 : getFirstpicture().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getViews() == null) ? 0 : getViews().hashCode());
        result = prime * result + ((getAppreciation() == null) ? 0 : getAppreciation().hashCode());
        result = prime * result + ((getSharestatement() == null) ? 0 : getSharestatement().hashCode());
        result = prime * result + ((getCommenttabled() == null) ? 0 : getCommenttabled().hashCode());
        result = prime * result + ((getPublished() == null) ? 0 : getPublished().hashCode());
        result = prime * result + ((getRecommend() == null) ? 0 : getRecommend().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", commentId=").append(commentId);
        sb.append(", typeId=").append(typeId);
        sb.append(", firstpicture=").append(firstpicture);
        sb.append(", flag=").append(flag);
        sb.append(", views=").append(views);
        sb.append(", appreciation=").append(appreciation);
        sb.append(", sharestatement=").append(sharestatement);
        sb.append(", commenttabled=").append(commenttabled);
        sb.append(", published=").append(published);
        sb.append(", recommend=").append(recommend);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}