package com.pojo;

public class Dynamicstatus {
    private String statusName;

    private String statusValue;

    public Dynamicstatus(String statusName, String statusValue) {
        this.statusName = statusName;
        this.statusValue = statusValue;
    }

    public Dynamicstatus() {
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