package com.ddogring.homepage.model;

import java.io.Serializable;
import java.util.Date;

public class Diary implements Serializable {
    /**
     * 日记id
	 * 2021-02-16T22:43:46.602
     */
    private Integer id;

    /**
     * 记录时间
	 * 2021-02-16T22:43:46.602
     */
    private Date recordTime;

    /**
     * 创建时间
	 * 2021-02-16T22:43:46.602
     */
    private Date createTime;

    /**
     * 更新时间
	 * 2021-02-16T22:43:46.602
     */
    private Date updTime;

    /**
     * 日记内容
	 * 2021-02-16T22:43:46.602
     */
    private String content;

    /**
    
	 * 2021-02-16T22:43:46.602
     */
    private static final long serialVersionUID = 1L;

    /**
     * 日记id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 日记id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 记录时间
     */
    public Date getRecordTime() {
        return recordTime;
    }

    /**
     * 记录时间
     */
    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
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

    /**
     * 日记内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 日记内容
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
        sb.append(", recordTime=").append(recordTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updTime=").append(updTime);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}