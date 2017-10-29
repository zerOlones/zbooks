package com.pojo;

import java.util.Date;

public class Messagesplus {
    private Integer messagePid;

    private Integer send;

    private Integer receive;

    private String title;

    private String message;

    private Integer readed;

    private Date sendtime;

    private String receiveName;

    private String sendName;

    public Messagesplus(Integer messagePid, Integer send, Integer receive, String title, String message, Integer readed, Date sendtime, String receiveName, String sendName) {
        this.messagePid = messagePid;
        this.send = send;
        this.receive = receive;
        this.title = title;
        this.message = message;
        this.readed = readed;
        this.sendtime = sendtime;
        this.receiveName = receiveName;
        this.sendName = sendName;
    }

    public Messagesplus() {
        super();
    }

    public Integer getMessagePid() {
        return messagePid;
    }

    public void setMessagePid(Integer messagePid) {
        this.messagePid = messagePid;
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

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName == null ? null : receiveName.trim();
    }

    public String getSendName() {
        return sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName == null ? null : sendName.trim();
    }
}