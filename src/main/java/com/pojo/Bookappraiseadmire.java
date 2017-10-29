package com.pojo;

import java.util.Date;

public class Bookappraiseadmire {
    private Integer appAdId;

    private Integer userId;

    private Integer appraiseId;

    private Date clickTime;

    public Bookappraiseadmire(Integer appAdId, Integer userId, Integer appraiseId, Date clickTime) {
        this.appAdId = appAdId;
        this.userId = userId;
        this.appraiseId = appraiseId;
        this.clickTime = clickTime;
    }

    public Bookappraiseadmire() {
        super();
    }

    public Integer getAppAdId() {
        return appAdId;
    }

    public void setAppAdId(Integer appAdId) {
        this.appAdId = appAdId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAppraiseId() {
        return appraiseId;
    }

    public void setAppraiseId(Integer appraiseId) {
        this.appraiseId = appraiseId;
    }

    public Date getClickTime() {
        return clickTime;
    }

    public void setClickTime(Date clickTime) {
        this.clickTime = clickTime;
    }
}