package com.pojo;

public class Fathertype {
    private Integer fatherType;

    private String typeName;

    private Integer sex;

    public Fathertype(Integer fatherType, String typeName, Integer sex) {
        this.fatherType = fatherType;
        this.typeName = typeName;
        this.sex = sex;
    }

    public Fathertype() {
        super();
    }

    public Integer getFatherType() {
        return fatherType;
    }

    public void setFatherType(Integer fatherType) {
        this.fatherType = fatherType;
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
}