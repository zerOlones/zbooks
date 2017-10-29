package com.dao;

import com.pojo.BConcern;

public interface BConcernMapper {
    int deleteByPrimaryKey(Integer concernBookId);

    int insert(BConcern record);

    int insertSelective(BConcern record);

    BConcern selectByPrimaryKey(Integer concernBookId);

    int updateByPrimaryKeySelective(BConcern record);

    int updateByPrimaryKey(BConcern record);
}