package com.pojo;

import java.util.Date;

public class Messages {
    private Integer messageId;

    private Integer send;

    private Integer receive;

    private String title;

    private String message;

    private Integer readed;

    private Date sendTime;

    public Messages(Integer messageId, Integer send, Integer receive, String title, String message, Integer readed, Date sendTime) {
        this.messageId = messageId;
        this.send = send;
        this.receive = receive;
        this.title = title;
        this.message = message;
        this.readed = readed;
        this.sendTime = sendTime;
    }

    public Messages() {
        super();
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Integer getSend() {
        return send;
    }

    public void setSend(Integer send) {
        this.send = send;
    }

    public Integer getReceive() {
        return receive;
    }

    public void setReceive(Integer receive) {
        this.receive = receive;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Integer getReaded() {
        return readed;
    }

    public void setReaded(Integer readed) {
        this.readed = readed;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
}