package com.pojo;

import java.util.Date;

public class Discussdetail {
    private Integer detailId;

    private Integer discussId;

    private Date pushTime;

    private Integer userId;

    private String content;

    private Integer admireNum;

    public Discussdetail(Integer detailId, Integer discussId, Date pushTime, Integer userId, String content, Integer admireNum) {
        this.detailId = detailId;
        this.discussId = discussId;
        this.pushTime = pushTime;
        this.userId = userId;
        this.content = content;
        this.admireNum = admireNum;
    }

    public Discussdetail() {
        super();
    }

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public Integer getDiscussId() {
        return discussId;
    }

    public void setDiscussId(Integer discussId) {
        this.discussId = discussId;
    }

    public Date getPushTime() {
        return pushTime;
    }

    public void setPushTime(Date pushTime) {
        this.pushTime = pushTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
}