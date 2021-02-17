package com.ddogring.homepage.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     * 用户id
	 * 2021-02-17T10:47:14.941
     */
    private Integer id;

    /**
     * 用户名
	 * 2021-02-17T10:47:14.943
     */
    private String username;

    /**
     * 密码
	 * 2021-02-17T10:47:14.943
     */
    private String password;

    /**
     * 邮箱
	 * 2021-02-17T10:47:14.943
     */
    private String mail;

    /**
     * 手机号
	 * 2021-02-17T10:47:14.943
     */
    private String mobile;

    /**
     * 用户地址
	 * 2021-02-17T10:47:14.943
     */
    private String address;

    /**
     * QQ
	 * 2021-02-17T10:47:14.943
     */
    private Integer qqNumber;

    /**
     * 创建时间
	 * 2021-02-17T10:47:14.943
     */
    private Date createTime;

    /**
     * 更新时间
	 * 2021-02-17T10:47:14.943
     */
    private Date updTime;

    /**
    
	 * 2021-02-17T10:47:14.943
     */
    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 用户id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 用户名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 邮箱
     */
    public String getMail() {
        return mail;
    }

    /**
     * 邮箱
     */
    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    /**
     * 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 用户地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 用户地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * QQ
     */
    public Integer getQqNumber() {
        return qqNumber;
    }

    /**
     * QQ
     */
    public void setQqNumber(Integer qqNumber) {
        this.qqNumber = qqNumber;
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
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", mail=").append(mail);
        sb.append(", mobile=").append(mobile);
        sb.append(", address=").append(address);
        sb.append(", qqNumber=").append(qqNumber);
        sb.append(", createTime=").append(createTime);
        sb.append(", updTime=").append(updTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}