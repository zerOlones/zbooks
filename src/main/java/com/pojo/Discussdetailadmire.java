package com.pojo;

import java.util.Date;

public class Discussdetailadmire {
    private Integer detAdId;

    private Integer userId;

    private Integer detailId;

    private Date clickTime;

    public Discussdetailadmire(Integer detAdId, Integer userId, Integer detailId, Date clickTime) {
        this.detAdId = detAdId;
        this.userId = userId;
        this.detailId = detailId;
        this.clickTime = clickTime;
    }

    public Discussdetailadmire() {
        super();
    }

    public Integer getDetAdId() {
        return detAdId;
    }

    public void setDetAdId(Integer detAdId) {
        this.detAdId = detAdId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public Date getClickTime() {
        return clickTime;
    }

    public void setClickTime(Date clickTime) {
        this.clickTime = clickTime;
    }
}