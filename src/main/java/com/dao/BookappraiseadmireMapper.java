package com.dao;

import com.pojo.Bookappraiseadmire;

public interface BookappraiseadmireMapper {
    int deleteByPrimaryKey(Integer appAdId);

    int insert(Bookappraiseadmire record);

    int insertSelective(Bookappraiseadmire record);

    Bookappraiseadmire selectByPrimaryKey(Integer appAdId);

    int updateByPrimaryKeySelective(Bookappraiseadmire record);

    int updateByPrimaryKey(Bookappraiseadmire record);
}