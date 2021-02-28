package com.ddogring.homepage.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     * 用户id
	 * 2021-02-23T22:32:47.458
     */
    private Integer id;

    /**
     * 用户名
	 * 2021-02-23T22:32:47.460
     */
    private String username;

    /**
     * 密码
	 * 2021-02-23T22:32:47.460
     */
    private String password;

    /**
     * 配合密码盐值
	 * 2021-02-23T22:32:47.460
     */
    private String salt;

    /**
     * 邮箱
	 * 2021-02-23T22:32:47.460
     */
    private String mail;

    /**
     * 手机号
	 * 2021-02-23T22:32:47.460
     */
    private String mobile;

    /**
     * 用户地址
	 * 2021-02-23T22:32:47.460
     */
    private String address;

    /**
     * QQ
	 * 2021-02-23T22:32:47.460
     */
    private Integer qqNumber;

    /**
     * 用户加密串
	 * 2021-02-23T22:32:47.460
     */
    private String token;

    /**
     * 设置记住我
     * 2021-02-23T22:32:47.460
     */
    private boolean RememberMe;

    /**
     * 创建时间
	 * 2021-02-23T22:32:47.460
     */
    private Date createTime;

    /**
     * 更新时间
	 * 2021-02-23T22:32:47.460
     */
    private Date updTime;

    /**
    
	 * 2021-02-23T22:32:47.461
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
     * 配合密码盐值
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 配合密码盐值
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
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
     * 用户加密串
     */
    public String getToken() {
        return token;
    }

    /**
     * 用户加密串
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public boolean getRememberMe() {
        return RememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        RememberMe = rememberMe;
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
        sb.append(", salt=").append(salt);
        sb.append(", mail=").append(mail);
        sb.append(", mobile=").append(mobile);
        sb.append(", address=").append(address);
        sb.append(", qqNumber=").append(qqNumber);
        sb.append(", token=").append(token);
        sb.append(", createTime=").append(createTime);
        sb.append(", updTime=").append(updTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}