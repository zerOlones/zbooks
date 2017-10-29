package com.dao;

import com.pojo.Purchaselist;

public interface PurchaselistMapper {
    int deleteByPrimaryKey(Integer purchaseId);

    int insert(Purchaselist record);

    int insertSelective(Purchaselist record);

    Purchaselist selectByPrimaryKey(Integer purchaseId);

    int updateByPrimaryKeySelective(Purchaselist record);

    int updateByPrimaryKey(Purchaselist record);
}