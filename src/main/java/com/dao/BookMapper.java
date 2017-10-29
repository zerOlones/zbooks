package com.dao;

import com.pojo.Book;
import com.pojo.BookWithBLOBs;

public interface BookMapper {
    int deleteByPrimaryKey(Integer bookId);

    int insert(BookWithBLOBs record);

    int insertSelective(BookWithBLOBs record);

    BookWithBLOBs selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(BookWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BookWithBLOBs record);

    int updateByPrimaryKey(Book record);
}