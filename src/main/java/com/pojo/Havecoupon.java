package com.pojo;

public class Havecoupon {
    private Integer haveId;

    private Integer cashId;

    private Integer userId;

    private Integer num;

    public Havecoupon(Integer haveId, Integer cashId, Integer userId, Integer num) {
        this.haveId = haveId;
        this.cashId = cashId;
        this.userId = userId;
        this.num = num;
    }

    public Havecoupon() {
        super();
    }

    public Integer getHaveId() {
        return haveId;
    }

    public void setHaveId(Integer haveId) {
        this.haveId = haveId;
    }

    public Integer getCashId() {
        return cashId;
    }

    public void setCashId(Integer cashId) {
        this.cashId = cashId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}