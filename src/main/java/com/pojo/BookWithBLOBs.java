package com.pojo;

import java.util.Date;

public class BookWithBLOBs extends Book {
    private String allVarcharacter;

    private String clickNum;

    private String readNum;

    private String incomeNum;

    private String income;

    public BookWithBLOBs(Integer bookId, String bookName, Integer authorId, String cover, String introduce, Integer bookType, Date createTime, Integer bookStatus, Integer writeStatus, Float score, Integer thousandPay, Integer free, String allVarcharacter, String clickNum, String readNum, String incomeNum, String income) {
        super(bookId, bookName, authorId, cover, introduce, bookType, createTime, bookStatus, writeStatus, score, thousandPay, free);
        this.allVarcharacter = allVarcharacter;
        this.clickNum = clickNum;
        this.readNum = readNum;
        this.incomeNum = incomeNum;
        this.income = income;
    }

    public BookWithBLOBs() {
        super();
    }

    public String getAllVarcharacter() {
        return allVarcharacter;
    }

    public void setAllVarcharacter(String allVarcharacter) {
        this.allVarcharacter = allVarcharacter == null ? null : allVarcharacter.trim();
    }

    public String getClickNum() {
        return clickNum;
    }

    public void setClickNum(String clickNum) {
        this.clickNum = clickNum == null ? null : clickNum.trim();
    }

    public String getReadNum() {
        return readNum;
    }

    public void setReadNum(String readNum) {
        this.readNum = readNum == null ? null : readNum.trim();
    }

    public String getIncomeNum() {
        return incomeNum;
    }

    public void setIncomeNum(String incomeNum) {
        this.incomeNum = incomeNum == null ? null : incomeNum.trim();
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income == null ? null : income.trim();
    }
}