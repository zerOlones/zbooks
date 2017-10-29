package com.pojo;

import java.util.Date;

public class User {
    private Integer userId;

    private String name;

    private Integer sex;

    private Date birthday;

    private String password;

    private String email;

    private Integer phone;

    private Integer income;

    private String lastIp;

    private String title;

    private String account;

    public User(Integer userId, String name, Integer sex, Date birthday, String password, String email, Integer phone, Integer income, String lastIp, String title, String account) {
        this.userId = userId;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.income = income;
        this.lastIp = lastIp;
        this.title = title;
        this.account = account;
    }

    public User() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp == null ? null : lastIp.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }
}