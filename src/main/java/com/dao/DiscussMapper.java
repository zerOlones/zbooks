package com.dao;

import com.pojo.Discuss;

public interface DiscussMapper {
    int deleteByPrimaryKey(Integer discussId);

    int insert(Discuss record);

    int insertSelective(Discuss record);

    Discuss selectByPrimaryKey(Integer discussId);

    int updateByPrimaryKeySelective(Discuss record);

    int updateByPrimaryKey(Discuss record);
}