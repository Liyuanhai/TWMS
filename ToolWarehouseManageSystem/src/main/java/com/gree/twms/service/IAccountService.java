package com.gree.twms.service;

import com.github.pagehelper.PageInfo;
import com.gree.twms.pojo.Account;

public interface IAccountService {
    //分页条件查询用户
    PageInfo<Account> conditionQueryPage(Integer pageNum, String conditions, String keywords);

    //插入
    int insertSelective(Account record);

    int deleteByPrimaryKey(int id);
}
