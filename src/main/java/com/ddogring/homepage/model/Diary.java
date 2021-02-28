package com.ddogring.homepage.model;

import java.io.Serializable;
import java.util.Date;

public class Diary implements Serializable {
    /**
     * �ռ�id
	 * 2021-02-28T22:07:20.649
     */
    private Integer id;

    /**
     * ��¼ʱ��
	 * 2021-02-28T22:07:20.649
     */
    private Date recordTime;

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
     * �ռ�����
	 * 2021-02-28T22:07:20.649
     */
    private String content;

    /**
    
	 * 2021-02-28T22:07:20.649
     */
    private static final long serialVersionUID = 1L;

    /**
     * �ռ�id
     */
    public Integer getId() {
        return id;
    }

    /**
     * �ռ�id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * ��¼ʱ��
     */
    public Date getRecordTime() {
        return recordTime;
    }

    /**
     * ��¼ʱ��
     */
    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
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
     * �ռ�����
     */
    public String getContent() {
        return content;
    }

    /**
     * �ռ�����
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