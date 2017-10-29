package com.pojo;

import java.util.Date;

public class Bonuslist {
    private Integer incomeId;

    private Integer bookId;

    private Integer userId;

    private Integer income;

    private Integer catalogId;

    private Date pTime;

    public Bonuslist(Integer incomeId, Integer bookId, Integer userId, Integer income, Integer catalogId, Date pTime) {
        this.incomeId = incomeId;
        this.bookId = bookId;
        this.userId = userId;
        this.income = income;
        this.catalogId = catalogId;
        this.pTime = pTime;
    }

    public Bonuslist() {
        super();
    }

    public Integer getIncomeId() {
        return incomeId;
    }

    public void setIncomeId(Integer incomeId) {
        this.incomeId = incomeId;
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

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public Integer getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(Integer catalogId) {
        this.catalogId = catalogId;
    }

    public Date getpTime() {
        return pTime;
    }

    public void setpTime(Date pTime) {
        this.pTime = pTime;
    }
}