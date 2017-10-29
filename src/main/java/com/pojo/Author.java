package com.pojo;

public class Author {
    private Integer authorId;

    private String name;

    private Integer sex;

    private String idCard;

    private String trueName;

    private String password;

    private String qq;

    private String phone;

    private String email;

    private String title;

    private String account;

    public Author(Integer authorId, String name, Integer sex, String idCard, String trueName, String password, String qq, String phone, String email, String title, String account) {
        this.authorId = authorId;
        this.name = name;
        this.sex = sex;
        this.idCard = idCard;
        this.trueName = trueName;
        this.password = password;
        this.qq = qq;
        this.phone = phone;
        this.email = email;
        this.title = title;
        this.account = account;
    }

    public Author() {
        super();
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName == null ? null : trueName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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