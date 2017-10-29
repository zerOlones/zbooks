package com.pojo;

import java.util.Date;

public class Purchaselist {
    private Integer purchaseId;

    private Integer userId;

    private Integer catalogId;

    private Integer bookId;

    private Integer cashId;

    private Date dealTime;

    private Float payMoney;

    public Purchaselist(Integer purchaseId, Integer userId, Integer catalogId, Integer bookId, Integer cashId, Date dealTime, Float payMoney) {
        this.purchaseId = purchaseId;
        this.userId = userId;
        this.catalogId = catalogId;
        this.bookId = bookId;
        this.cashId = cashId;
        this.dealTime = dealTime;
        this.payMoney = payMoney;
    }

    public Purchaselist() {
        super();
    }

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(Integer catalogId) {
        this.catalogId = catalogId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getCashId() {
        return cashId;
    }

    public void setCashId(Integer cashId) {
        this.cashId = cashId;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public Float getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Float payMoney) {
        this.payMoney = payMoney;
    }
}