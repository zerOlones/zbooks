package com.dao;

import com.pojo.Bookshelfold;

public interface BookshelfoldMapper {
    int insert(Bookshelfold record);

    int insertSelective(Bookshelfold record);
}