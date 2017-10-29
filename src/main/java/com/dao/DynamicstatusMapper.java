package com.dao;

import com.pojo.Dynamicstatus;

public interface DynamicstatusMapper {
    int insert(Dynamicstatus record);

    int insertSelective(Dynamicstatus record);
}