package com.pojo;

import java.util.Date;

public class Bookappraise {
    private Integer appraiseId;

    private Integer bookId;

    private Integer userId;

    private Integer score;

    private String content;

    private Integer admireNum;

    private Date pushTime;

    public Bookappraise(Integer appraiseId, Integer bookId, Integer userId, Integer score, String content, Integer admireNum, Date pushTime) {
        this.appraiseId = appraiseId;
        this.bookId = bookId;
        this.userId = userId;
        this.score = score;
        this.content = content;
        this.admireNum = admireNum;
        this.pushTime = pushTime;
    }

    public Bookappraise() {
        super();
    }

    public Integer getAppraiseId() {
        return appraiseId;
    }

    public void setAppraiseId(Integer appraiseId) {
        this.appraiseId = appraiseId;
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

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getAdmireNum() {
        return admireNum;
    }

    public void setAdmireNum(Integer admireNum) {
        this.admireNum = admireNum;
    }

    public Date getPushTime() {
        return pushTime;
    }

    public void setPushTime(Date pushTime) {
        this.pushTime = pushTime;
    }
}