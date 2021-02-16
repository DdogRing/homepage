package com.ddogring.homepage.model;

import java.io.Serializable;
import java.util.Date;

public class SpecialColumn implements Serializable {
    /**
     * 专栏id
	 * 2021-02-16T22:43:46.603
     */
    private Integer id;

    /**
     * 用户id
	 * 2021-02-16T22:43:46.603
     */
    private Integer userId;

    /**
     * 专栏名称
	 * 2021-02-16T22:43:46.603
     */
    private String specialColumnName;

    /**
     * 创建时间
	 * 2021-02-16T22:43:46.603
     */
    private Date createTime;

    /**
     * 更新时间
	 * 2021-02-16T22:43:46.603
     */
    private Date updTime;

    /**
    
	 * 2021-02-16T22:43:46.603
     */
    private static final long serialVersionUID = 1L;

    /**
     * 专栏id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 专栏id
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
     * 专栏名称
     */
    public String getSpecialColumnName() {
        return specialColumnName;
    }

    /**
     * 专栏名称
     */
    public void setSpecialColumnName(String specialColumnName) {
        this.specialColumnName = specialColumnName == null ? null : specialColumnName.trim();
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
        sb.append(", specialColumnName=").append(specialColumnName);
        sb.append(", createTime=").append(createTime);
        sb.append(", updTime=").append(updTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}