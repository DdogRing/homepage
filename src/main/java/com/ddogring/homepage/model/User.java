package com.ddogring.homepage.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     * �û�id
	 * 2021-02-23T22:32:47.458
     */
    private Integer id;

    /**
     * �û���
	 * 2021-02-23T22:32:47.460
     */
    private String username;

    /**
     * ����
	 * 2021-02-23T22:32:47.460
     */
    private String password;

    /**
     * ���������ֵ
	 * 2021-02-23T22:32:47.460
     */
    private String salt;

    /**
     * ����
	 * 2021-02-23T22:32:47.460
     */
    private String mail;

    /**
     * �ֻ���
	 * 2021-02-23T22:32:47.460
     */
    private String mobile;

    /**
     * �û���ַ
	 * 2021-02-23T22:32:47.460
     */
    private String address;

    /**
     * QQ
	 * 2021-02-23T22:32:47.460
     */
    private Integer qqNumber;

    /**
     * �û����ܴ�
	 * 2021-02-23T22:32:47.460
     */
    private String token;

    /**
     * ����ʱ��
	 * 2021-02-23T22:32:47.460
     */
    private Date createTime;

    /**
     * ����ʱ��
	 * 2021-02-23T22:32:47.460
     */
    private Date updTime;

    /**
    
	 * 2021-02-23T22:32:47.461
     */
    private static final long serialVersionUID = 1L;

    /**
     * �û�id
     */
    public Integer getId() {
        return id;
    }

    /**
     * �û�id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * �û���
     */
    public String getUsername() {
        return username;
    }

    /**
     * �û���
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * ����
     */
    public String getPassword() {
        return password;
    }

    /**
     * ����
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * ���������ֵ
     */
    public String getSalt() {
        return salt;
    }

    /**
     * ���������ֵ
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * ����
     */
    public String getMail() {
        return mail;
    }

    /**
     * ����
     */
    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    /**
     * �ֻ���
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * �ֻ���
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * �û���ַ
     */
    public String getAddress() {
        return address;
    }

    /**
     * �û���ַ
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
     * �û����ܴ�
     */
    public String getToken() {
        return token;
    }

    /**
     * �û����ܴ�
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
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