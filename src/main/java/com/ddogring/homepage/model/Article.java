package com.ddogring.homepage.model;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
    /**
     * ����id
	 * 2021-02-28T22:07:20.641
     */
    private Integer id;

    /**
     * ר��id
	 * 2021-02-28T22:07:20.642
     */
    private Integer specialColumnId;

    /**
     * ���±���
	 * 2021-02-28T22:07:20.642
     */
    private String articleTitle;

    /**
     * ����
	 * 2021-02-28T22:07:20.642
     */
    private String author;

    /**
     * ������ʽ(0ԭ�� 1ժ¼)
	 * 2021-02-28T22:07:20.642
     */
    private Boolean articleForm;

    /**
     * ��������
	 * 2021-02-28T22:07:20.642
     */
    private Integer checkNumber;

    /**
     * ����ʱ��
	 * 2021-02-28T22:07:20.642
     */
    private Date createTime;

    /**
     * ����ʱ��
	 * 2021-02-28T22:07:20.643
     */
    private Date updTime;

    /**
     * ��������
	 * 2021-02-28T22:07:20.643
     */
    private String articleContent;

    /**
    
	 * 2021-02-28T22:07:20.643
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
     * ר��id
     */
    public Integer getSpecialColumnId() {
        return specialColumnId;
    }

    /**
     * ר��id
     */
    public void setSpecialColumnId(Integer specialColumnId) {
        this.specialColumnId = specialColumnId;
    }

    /**
     * ���±���
     */
    public String getArticleTitle() {
        return articleTitle;
    }

    /**
     * ���±���
     */
    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    /**
     * ����
     */
    public String getAuthor() {
        return author;
    }

    /**
     * ����
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * ������ʽ(0ԭ�� 1ժ¼)
     */
    public Boolean getArticleForm() {
        return articleForm;
    }

    /**
     * ������ʽ(0ԭ�� 1ժ¼)
     */
    public void setArticleForm(Boolean articleForm) {
        this.articleForm = articleForm;
    }

    /**
     * ��������
     */
    public Integer getCheckNumber() {
        return checkNumber;
    }

    /**
     * ��������
     */
    public void setCheckNumber(Integer checkNumber) {
        this.checkNumber = checkNumber;
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
    public String getArticleContent() {
        return articleContent;
    }

    /**
     * ��������
     */
    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", specialColumnId=").append(specialColumnId);
        sb.append(", articleTitle=").append(articleTitle);
        sb.append(", author=").append(author);
        sb.append(", articleForm=").append(articleForm);
        sb.append(", checkNumber=").append(checkNumber);
        sb.append(", createTime=").append(createTime);
        sb.append(", updTime=").append(updTime);
        sb.append(", articleContent=").append(articleContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}