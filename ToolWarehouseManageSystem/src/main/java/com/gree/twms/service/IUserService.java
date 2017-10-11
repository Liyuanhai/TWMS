package com.gree.twms.service;


import com.gree.twms.pojo.User;

import java.util.List;


public interface IUserService {

    //验证用户名密码是否正确
    User selectIsValidUser(User user);

    //插入User
    int insertSelective(User record);

    //显示所有用户
    List<User> selectAllUser();
}
