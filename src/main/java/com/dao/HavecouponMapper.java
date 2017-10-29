package com.dao;

import com.pojo.Havecoupon;

public interface HavecouponMapper {
    int deleteByPrimaryKey(Integer haveId);

    int insert(Havecoupon record);

    int insertSelective(Havecoupon record);

    Havecoupon selectByPrimaryKey(Integer haveId);

    int updateByPrimaryKeySelective(Havecoupon record);

    int updateByPrimaryKey(Havecoupon record);
}