package com.ddogring.homepage.model;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
    /**
     * ����id
	 * 2021-02-28T22:07:20.649
     */
    private Integer id;

    /**
     * �û�id
	 * 2021-02-28T22:07:20.649
     */
    private Integer userId;

    /**
     * ����id
	 * 2021-02-28T22:07:20.649
     */
    private Integer articleId;

    /**
     * ����ʱ��
	 * 2021-02-28T22:07:20.649
     */
    private Date createTime;

    /**
     * ����ʱ��
	 * 2021-02-28T22:07:20.649
     */
    private Date updTime;

    /**
     * ��������
	 * 2021-02-28T22:07:20.649
     */
    private String content;

    /**
    
	 * 2021-02-28T22:07:20.649
     */
    private static final long serialVersionUID = 1L;

    /**
     * ����id
     */
    public Integer getId() {
        return id;
    }

    /**
     * ����id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * �û�id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * �û�id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * ����id
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * ����id
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    /**
     * ����ʱ��
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * ����ʱ��
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * ����ʱ��
     */
    public Date getUpdTime() {
        return updTime;
    }

    /**
     * ����ʱ��
     */
    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }

    /**
     * ��������
     */
    public String getContent() {
        return content;
    }

    /**
     * ��������
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
        sb.append(", createTime=").append(createTime);
        sb.append(", updTime=").append(updTime);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}