package com.pojo;

import java.util.Date;

public class Bookshelfold {
    private Integer bookId;

    private Integer userId;

    private Date deleteTime;

    public Bookshelfold(Integer bookId, Integer userId, Date deleteTime) {
        this.bookId = bookId;
        this.userId = userId;
        this.deleteTime = deleteTime;
    }

    public Bookshelfold() {
        super();
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }
}