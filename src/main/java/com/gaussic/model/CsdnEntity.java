package com.gaussic.model;

import javax.persistence.*;

/**
 * Created by ffpeng on 2017/3/7.
 */
@Entity
@Table(name = "csdnblog", schema = "sakila", catalog = "")
public class CsdnEntity {

    private long csdnBlogId;
    private long articleId;
    private String title;
    private String author;
    private int readCnt;
    private String url;

    @Basic
    @Column(name = "articleId", nullable = true)
    public long getArticleId() {
        return articleId;
    }

    public void setArticleId(long articleId) {
        this.articleId = articleId;
    }

    @Basic
    @Column(name = "title", nullable = true)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "author", nullable = true)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "readCnt", nullable = true)
    public int getReadCnt() {
        return readCnt;
    }

    public void setReadCnt(int readCnt) {
        this.readCnt = readCnt;
    }

    @Basic
    @Column(name = "url", nullable = true)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Id
    @Column(name = "csdnBlogId", nullable = false)
    public long getCsdnBlogId() {
        return csdnBlogId;
    }

    public void setCsdnBlogId(long csdnBlogId) {
        this.csdnBlogId = csdnBlogId;
    }
}
