package com.gree.twms.service;


import com.github.pagehelper.PageInfo;
import com.gree.twms.pojo.User;


public interface IUserService {

    //验证用户名密码是否正确
    User selectIsValidUser(User user);

    //插入User
    int insertSelective(User record);


    //删除用户
    int deleteByPrimaryKey(String pid);

    //分页条件查询用户
    PageInfo<User> conditionQueryPage(Integer pageNum, String conditions, String keywords);

    //按条件统计数量
    int countByPid(String pID);

    int updateByPid(User record);
}
