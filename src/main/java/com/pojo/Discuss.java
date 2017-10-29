package com.pojo;

public class Discuss {
    private Integer discussId;

    private Integer bookId;

    private Integer userId;

    private String title;

    private String content;

    private Integer admireNum;

    private Integer discussNum;

    private Integer top;

    private Integer deletes;

    public Discuss(Integer discussId, Integer bookId, Integer userId, String title, String content, Integer admireNum, Integer discussNum, Integer top, Integer deletes) {
        this.discussId = discussId;
        this.bookId = bookId;
        this.userId = userId;
        this.title = title;
        this.content = content;
        this.admireNum = admireNum;
        this.discussNum = discussNum;
        this.top = top;
        this.deletes = deletes;
    }

    public Discuss() {
        super();
    }

    public Integer getDiscussId() {
        return discussId;
    }

    public void setDiscussId(Integer discussId) {
        this.discussId = discussId;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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

    public Integer getDiscussNum() {
        return discussNum;
    }

    public void setDiscussNum(Integer discussNum) {
        this.discussNum = discussNum;
    }

    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    public Integer getDeletes() {
        return deletes;
    }

    public void setDeletes(Integer deletes) {
        this.deletes = deletes;
    }
}