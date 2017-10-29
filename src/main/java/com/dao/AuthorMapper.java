package com.dao;

import com.pojo.Author;

public interface AuthorMapper {
    int deleteByPrimaryKey(Integer authorId);

    int insert(Author record);

    int insertSelective(Author record);

    Author selectByPrimaryKey(Integer authorId);

    int updateByPrimaryKeySelective(Author record);

    int updateByPrimaryKeyWithBLOBs(Author record);

    int updateByPrimaryKey(Author record);
}