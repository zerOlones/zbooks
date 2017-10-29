package com.dao;

import com.pojo.Bookappraise;

public interface BookappraiseMapper {
    int deleteByPrimaryKey(Integer appraiseId);

    int insert(Bookappraise record);

    int insertSelective(Bookappraise record);

    Bookappraise selectByPrimaryKey(Integer appraiseId);

    int updateByPrimaryKeySelective(Bookappraise record);

    int updateByPrimaryKey(Bookappraise record);
}