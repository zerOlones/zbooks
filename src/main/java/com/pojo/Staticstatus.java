package com.pojo;

public class Staticstatus {
    private String statusName;

    private String statusValue;

    public Staticstatus(String statusName, String statusValue) {
        this.statusName = statusName;
        this.statusValue = statusValue;
    }

    public Staticstatus() {
        super();
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName == null ? null : statusName.trim();
    }

    public String getStatusValue() {
        return statusValue;
    }

    public void setStatusValue(String statusValue) {
        this.statusValue = statusValue == null ? null : statusValue.trim();
    }
}