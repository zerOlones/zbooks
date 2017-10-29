package com.dao;

import com.pojo.Clicklist;

public interface ClicklistMapper {
    int deleteByPrimaryKey(Integer clickId);

    int insert(Clicklist record);

    int insertSelective(Clicklist record);

    Clicklist selectByPrimaryKey(Integer clickId);

    int updateByPrimaryKeySelective(Clicklist record);

    int updateByPrimaryKey(Clicklist record);
}