package com.pojo;

import java.util.Date;

public class Discussadmire {
    private Integer disAdId;

    private Integer userId;

    private Integer discussId;

    private Date clickTime;

    public Discussadmire(Integer disAdId, Integer userId, Integer discussId, Date clickTime) {
        this.disAdId = disAdId;
        this.userId = userId;
        this.discussId = discussId;
        this.clickTime = clickTime;
    }

    public Discussadmire() {
        super();
    }

    public Integer getDisAdId() {
        return disAdId;
    }

    public void setDisAdId(Integer disAdId) {
        this.disAdId = disAdId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDiscussId() {
        return discussId;
    }

    public void setDiscussId(Integer discussId) {
        this.discussId = discussId;
    }

    public Date getClickTime() {
        return clickTime;
    }

    public void setClickTime(Date clickTime) {
        this.clickTime = clickTime;
    }
}