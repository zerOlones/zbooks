package com.dao;

import com.pojo.Bonuslist;

public interface BonuslistMapper {
    int deleteByPrimaryKey(Integer incomeId);

    int insert(Bonuslist record);

    int insertSelective(Bonuslist record);

    Bonuslist selectByPrimaryKey(Integer incomeId);

    int updateByPrimaryKeySelective(Bonuslist record);

    int updateByPrimaryKey(Bonuslist record);
}