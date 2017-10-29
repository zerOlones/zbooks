package com.dao;

import com.pojo.Booktype;

public interface BooktypeMapper {
    int deleteByPrimaryKey(Integer bookType);

    int insert(Booktype record);

    int insertSelective(Booktype record);

    Booktype selectByPrimaryKey(Integer bookType);

    int updateByPrimaryKeySelective(Booktype record);

    int updateByPrimaryKey(Booktype record);
}