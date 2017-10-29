package com.pojo;

public class Userhobby {
    private Integer hobbyId;

    private Integer userId;

    private Integer bookType;

    public Userhobby(Integer hobbyId, Integer userId, Integer bookType) {
        this.hobbyId = hobbyId;
        this.userId = userId;
        this.bookType = bookType;
    }

    public Userhobby() {
        super();
    }

    public Integer getHobbyId() {
        return hobbyId;
    }

    public void setHobbyId(Integer hobbyId) {
        this.hobbyId = hobbyId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBookType() {
        return bookType;
    }

    public void setBookType(Integer bookType) {
        this.bookType = bookType;
    }
}