package com.pojo;

public class BConcern {
    private Integer concernBookId;

    private Integer userId;

    private Integer bookId;

    public BConcern(Integer concernBookId, Integer userId, Integer bookId) {
        this.concernBookId = concernBookId;
        this.userId = userId;
        this.bookId = bookId;
    }

    public BConcern() {
        super();
    }

    public Integer getConcernBookId() {
        return concernBookId;
    }

    public void setConcernBookId(Integer concernBookId) {
        this.concernBookId = concernBookId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
}