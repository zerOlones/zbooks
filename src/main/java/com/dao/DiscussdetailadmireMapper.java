package com.dao;

import com.pojo.Discussdetailadmire;

public interface DiscussdetailadmireMapper {
    int deleteByPrimaryKey(Integer detAdId);

    int insert(Discussdetailadmire record);

    int insertSelective(Discussdetailadmire record);

    Discussdetailadmire selectByPrimaryKey(Integer detAdId);

    int updateByPrimaryKeySelective(Discussdetailadmire record);

    int updateByPrimaryKey(Discussdetailadmire record);
}