package com.dao;

import com.pojo.Discussdetail;

public interface DiscussdetailMapper {
    int deleteByPrimaryKey(Integer detailId);

    int insert(Discussdetail record);

    int insertSelective(Discussdetail record);

    Discussdetail selectByPrimaryKey(Integer detailId);

    int updateByPrimaryKeySelective(Discussdetail record);

    int updateByPrimaryKey(Discussdetail record);
}