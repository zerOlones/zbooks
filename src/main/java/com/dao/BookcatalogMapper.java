package com.dao;

import com.pojo.Bookcatalog;

public interface BookcatalogMapper {
    int deleteByPrimaryKey(Integer catalogId);

    int insert(Bookcatalog record);

    int insertSelective(Bookcatalog record);

    Bookcatalog selectByPrimaryKey(Integer catalogId);

    int updateByPrimaryKeySelective(Bookcatalog record);

    int updateByPrimaryKey(Bookcatalog record);
}