package com.dao;

import com.pojo.Messagesplus;

public interface MessagesplusMapper {
    int deleteByPrimaryKey(Integer messagePid);

    int insert(Messagesplus record);

    int insertSelective(Messagesplus record);

    Messagesplus selectByPrimaryKey(Integer messagePid);

    int updateByPrimaryKeySelective(Messagesplus record);

    int updateByPrimaryKey(Messagesplus record);
}