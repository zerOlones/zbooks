package com.pojo;

import java.util.Date;

public class Bookshelfnow {
    private Integer userId;

    private Integer bookId;

    private Date addTime;

    private Integer lastChapter;

    public Bookshelfnow(Integer userId, Integer bookId, Date addTime, Integer lastChapter) {
        this.userId = userId;
        this.bookId = bookId;
        this.addTime = addTime;
        this.lastChapter = lastChapter;
    }

    public Bookshelfnow() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getLastChapter() {
        return lastChapter;
    }

    public void setLastChapter(Integer lastChapter) {
        this.lastChapter = lastChapter;
    }
}