package com.pojo;

import java.util.Date;

public class Bookcatalog {
    private Integer catalogId;

    private Integer chapterId;

    private Integer bookId;

    private String chapterName;

    private String content;

    private Date upTime;

    private Integer chapterCharacter;

    private Integer isPay;

    public Bookcatalog(Integer catalogId, Integer chapterId, Integer bookId, String chapterName, String content, Date upTime, Integer chapterCharacter, Integer isPay) {
        this.catalogId = catalogId;
        this.chapterId = chapterId;
        this.bookId = bookId;
        this.chapterName = chapterName;
        this.content = content;
        this.upTime = upTime;
        this.chapterCharacter = chapterCharacter;
        this.isPay = isPay;
    }

    public Bookcatalog() {
        super();
    }

    public Integer getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(Integer catalogId) {
        this.catalogId = catalogId;
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName == null ? null : chapterName.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getUpTime() {
        return upTime;
    }

    public void setUpTime(Date upTime) {
        this.upTime = upTime;
    }

    public Integer getChapterCharacter() {
        return chapterCharacter;
    }

    public void setChapterCharacter(Integer chapterCharacter) {
        this.chapterCharacter = chapterCharacter;
    }

    public Integer getIsPay() {
        return isPay;
    }

    public void setIsPay(Integer isPay) {
        this.isPay = isPay;
    }
}