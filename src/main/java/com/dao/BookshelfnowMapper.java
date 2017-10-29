package com.dao;

import com.pojo.Bookshelfnow;

public interface BookshelfnowMapper {
    int insert(Bookshelfnow record);

    int insertSelective(Bookshelfnow record);
}