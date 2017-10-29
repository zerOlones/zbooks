package com.pojo;

public class Clicklist {
    private Integer clickId;

    private Integer userId;

    private String ipAddress;

    private Integer catalogId;

    private Integer bookId;

    public Clicklist(Integer clickId, Integer userId, String ipAddress, Integer catalogId, Integer bookId) {
        this.clickId = clickId;
        this.userId = userId;
        this.ipAddress = ipAddress;
        this.catalogId = catalogId;
        this.bookId = bookId;
    }

    public Clicklist() {
        super();
    }

    public Integer getClickId() {
        return clickId;
    }

    public void setClickId(Integer clickId) {
        this.clickId = clickId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
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
}