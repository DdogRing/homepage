package com.ddogring.homepage.model;

import java.io.Serializable;
import java.util.Date;

public class SpecialColumn implements Serializable {
    /**
     * ר��id
	 * 2021-02-28T22:07:20.650
     */
    private Integer id;

    /**
     * �û�id
	 * 2021-02-28T22:07:20.650
     */
    private Integer userId;

    /**
     * ר������
	 * 2021-02-28T22:07:20.650
     */
    private String specialColumnName;

    /**
     * ר��ͼƬ��ַ
	 * 2021-02-28T22:07:20.650
     */
    private String image;

    /**
     * ����ʱ��
	 * 2021-02-28T22:07:20.650
     */
    private Date createTime;

    /**
     * ����ʱ��
	 * 2021-02-28T22:07:20.650
     */
    private Date updTime;

    /**
    
	 * 2021-02-28T22:07:20.650
     */
    private static final long serialVersionUID = 1L;

    /**
     * ר��id
     */
    public Integer getId() {
        return id;
    }

    /**
     * ר��id
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
     * ר������
     */
    public String getSpecialColumnName() {
        return specialColumnName;
    }

    /**
     * ר������
     */
    public void setSpecialColumnName(String specialColumnName) {
        this.specialColumnName = specialColumnName == null ? null : specialColumnName.trim();
    }

    /**
     * ר��ͼƬ��ַ
     */
    public String getImage() {
        return image;
    }

    /**
     * ר��ͼƬ��ַ
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", specialColumnName=").append(specialColumnName);
        sb.append(", image=").append(image);
        sb.append(", createTime=").append(createTime);
        sb.append(", updTime=").append(updTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}