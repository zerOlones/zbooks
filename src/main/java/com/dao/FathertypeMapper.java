package com.dao;

import com.pojo.Fathertype;

public interface FathertypeMapper {
    int deleteByPrimaryKey(Integer fatherType);

    int insert(Fathertype record);

    int insertSelective(Fathertype record);

    Fathertype selectByPrimaryKey(Integer fatherType);

    int updateByPrimaryKeySelective(Fathertype record);

    int updateByPrimaryKey(Fathertype record);
}