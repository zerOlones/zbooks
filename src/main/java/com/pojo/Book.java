package com.pojo;

import java.util.Date;

public class Book {
    private Integer bookId;

    private String bookName;

    private Integer authorId;

    private String cover;

    private String introduce;

    private Integer bookType;

    private Date createTime;

    private Integer bookStatus;

    private Integer writeStatus;

    private Float score;

    private Integer thousandPay;

    private Integer free;

    public Book(Integer bookId, String bookName, Integer authorId, String cover, String introduce, Integer bookType, Date createTime, Integer bookStatus, Integer writeStatus, Float score, Integer thousandPay, Integer free) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorId = authorId;
        this.cover = cover;
        this.introduce = introduce;
        this.bookType = bookType;
        this.createTime = createTime;
        this.bookStatus = bookStatus;
        this.writeStatus = writeStatus;
        this.score = score;
        this.thousandPay = thousandPay;
        this.free = free;
    }

    public Book() {
        super();
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public Integer getBookType() {
        return bookType;
    }

    public void setBookType(Integer bookType) {
        this.bookType = bookType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(Integer bookStatus) {
        this.bookStatus = bookStatus;
    }

    public Integer getWriteStatus() {
        return writeStatus;
    }

    public void setWriteStatus(Integer writeStatus) {
        this.writeStatus = writeStatus;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Integer getThousandPay() {
        return thousandPay;
    }

    public void setThousandPay(Integer thousandPay) {
        this.thousandPay = thousandPay;
    }

    public Integer getFree() {
        return free;
    }

    public void setFree(Integer free) {
        this.free = free;
    }
}