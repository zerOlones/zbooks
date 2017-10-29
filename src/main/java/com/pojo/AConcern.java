package com.pojo;

public class AConcern {
    private Integer concernAuthorId;

    private Integer userId;

    private Integer authorId;

    public AConcern(Integer concernAuthorId, Integer userId, Integer authorId) {
        this.concernAuthorId = concernAuthorId;
        this.userId = userId;
        this.authorId = authorId;
    }

    public AConcern() {
        super();
    }

    public Integer getConcernAuthorId() {
        return concernAuthorId;
    }

    public void setConcernAuthorId(Integer concernAuthorId) {
        this.concernAuthorId = concernAuthorId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }
}