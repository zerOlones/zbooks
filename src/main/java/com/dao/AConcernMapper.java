package com.dao;

import com.pojo.AConcern;

public interface AConcernMapper {
    int deleteByPrimaryKey(Integer concernAuthorId);

    int insert(AConcern record);

    int insertSelective(AConcern record);

    AConcern selectByPrimaryKey(Integer concernAuthorId);

    int updateByPrimaryKeySelective(AConcern record);

    int updateByPrimaryKey(AConcern record);
}