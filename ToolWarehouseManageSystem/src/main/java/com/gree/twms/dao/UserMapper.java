package com.gree.twms.dao;

import com.gree.twms.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(String pid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String pid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectIsValidUser(String pid, String pwd);
}