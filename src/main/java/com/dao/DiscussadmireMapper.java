package com.dao;

import com.pojo.Discussadmire;

public interface DiscussadmireMapper {
    int deleteByPrimaryKey(Integer disAdId);

    int insert(Discussadmire record);

    int insertSelective(Discussadmire record);

    Discussadmire selectByPrimaryKey(Integer disAdId);

    int updateByPrimaryKeySelective(Discussadmire record);

    int updateByPrimaryKey(Discussadmire record);
}