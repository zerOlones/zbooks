package com.dao;

import com.pojo.Cashcoupon;

public interface CashcouponMapper {
    int deleteByPrimaryKey(Integer cashId);

    int insert(Cashcoupon record);

    int insertSelective(Cashcoupon record);

    Cashcoupon selectByPrimaryKey(Integer cashId);

    int updateByPrimaryKeySelective(Cashcoupon record);

    int updateByPrimaryKey(Cashcoupon record);
}