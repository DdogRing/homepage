package com.ddogring.homepage.model;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
    /**
     * 文章id
	 * 2021-02-28T22:07:20.641
     */
    private Integer id;

    /**
     * 专栏id
	 * 2021-02-28T22:07:20.642
     */
    private Integer specialColumnId;

    /**
     * 文章标题
	 * 2021-02-28T22:07:20.642
     */
    private String articleTitle;

    /**
     * 作者
	 * 2021-02-28T22:07:20.642
     */
    private String author;

    /**
     * 文章形式(0原创 1摘录)
	 * 2021-02-28T22:07:20.642
     */
    private Boolean articleForm;

    /**
     * 访问数量
	 * 2021-02-28T22:07:20.642
     */
    private Integer checkNumber;

    /**
     * 创建时间
	 * 2021-02-28T22:07:20.642
     */
    private Date createTime;

    /**
     * 更新时间
	 * 2021-02-28T22:07:20.643
     */
    private Date updTime;

    /**
     * 文章内容
	 * 2021-02-28T22:07:20.643
     */
    private String articleContent;

    /**
    
	 * 2021-02-28T22:07:20.643
     */
    private static final long serialVersionUID = 1L;

    /**
     * 文章id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 文章id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 专栏id
     */
    public Integer getSpecialColumnId() {
        return specialColumnId;
    }

    /**
     * 专栏id
     */
    public void setSpecialColumnId(Integer specialColumnId) {
        this.specialColumnId = specialColumnId;
    }

    /**
     * 文章标题
     */
    public String getArticleTitle() {
        return articleTitle;
    }

    /**
     * 文章标题
     */
    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    /**
     * 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 作者
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * 文章形式(0原创 1摘录)
     */
    public Boolean getArticleForm() {
        return articleForm;
    }

    /**
     * 文章形式(0原创 1摘录)
     */
    public void setArticleForm(Boolean articleForm) {
        this.articleForm = articleForm;
    }

    /**
     * 访问数量
     */
    public Integer getCheckNumber() {
        return checkNumber;
    }

    /**
     * 访问数量
     */
    public void setCheckNumber(Integer checkNumber) {
        this.checkNumber = checkNumber;
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
     * 文章内容
     */
    public String getArticleContent() {
        return articleContent;
    }

    /**
     * 文章内容
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