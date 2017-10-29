package com.pojo;

import java.util.Date;

public class Cashcoupon {
    private Integer cashId;

    private String name;

    private Float discount;

    private Integer preferential;

    private Date startTime;

    private Date endTime;

    public Cashcoupon(Integer cashId, String name, Float discount, Integer preferential, Date startTime, Date endTime) {
        this.cashId = cashId;
        this.name = name;
        this.discount = discount;
        this.preferential = preferential;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Cashcoupon() {
        super();
    }

    public Integer getCashId() {
        return cashId;
    }

    public void setCashId(Integer cashId) {
        this.cashId = cashId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public Integer getPreferential() {
        return preferential;
    }

    public void setPreferential(Integer preferential) {
        this.preferential = preferential;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}