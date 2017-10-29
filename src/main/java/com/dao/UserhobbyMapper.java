package com.dao;

import com.pojo.Userhobby;

public interface UserhobbyMapper {
    int deleteByPrimaryKey(Integer hobbyId);

    int insert(Userhobby record);

    int insertSelective(Userhobby record);

    Userhobby selectByPrimaryKey(Integer hobbyId);

    int updateByPrimaryKeySelective(Userhobby record);

    int updateByPrimaryKey(Userhobby record);
}