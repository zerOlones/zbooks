package com.pojo;

public class Booktype {
    private Integer bookType;

    private String typeName;

    private Integer sex;

    private Integer fatherType;

    public Booktype(Integer bookType, String typeName, Integer sex, Integer fatherType) {
        this.bookType = bookType;
        this.typeName = typeName;
        this.sex = sex;
        this.fatherType = fatherType;
    }

    public Booktype() {
        super();
    }

    public Integer getBookType() {
        return bookType;
    }

    public void setBookType(Integer bookType) {
        this.bookType = bookType;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getFatherType() {
        return fatherType;
    }

    public void setFatherType(Integer fatherType) {
        this.fatherType = fatherType;
    }
}