package com.ddogring.homepage.model;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
    /**
     * 评论id
	 * 2021-03-01T14:40:16.854
     */
    private Integer id;

    /**
     * 用户id
	 * 2021-03-01T14:40:16.854
     */
    private Integer userId;

    /**
     * 文章id
	 * 2021-03-01T14:40:16.854
     */
    private Integer articleId;

    /**
     * 评论内容
	 * 2021-03-01T14:40:16.854
     */
    private String content;

    /**
     * 创建时间
	 * 2021-03-01T14:40:16.854
     */
    private Date createTime;

    /**
     * 更新时间
	 * 2021-03-01T14:40:16.854
     */
    private Date updTime;

    /**
    
	 * 2021-03-01T14:40:16.854
     */
    private static final long serialVersionUID = 1L;

    /**
     * 评论id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 评论id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 文章id
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * 文章id
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    /**
     * 评论内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 评论内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     */
    public Date getUpdTime() {
        return updTime;
    }

    /**
     * 更新时间
     */
    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", articleId=").append(articleId);
        sb.append(", content=").append(content);
        sb.append(", createTime=").append(createTime);
        sb.append(", updTime=").append(updTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}