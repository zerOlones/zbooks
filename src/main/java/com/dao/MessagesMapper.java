package com.dao;

import com.pojo.Messages;

public interface MessagesMapper {
    int deleteByPrimaryKey(Integer messageId);

    int insert(Messages record);

    int insertSelective(Messages record);

    Messages selectByPrimaryKey(Integer messageId);

    int updateByPrimaryKeySelective(Messages record);

    int updateByPrimaryKey(Messages record);
}