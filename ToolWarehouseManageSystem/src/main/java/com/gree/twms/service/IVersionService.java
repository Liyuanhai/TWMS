package com.gree.twms.service;

import com.github.pagehelper.PageInfo;
import com.gree.twms.pojo.Version;

public interface IVersionService {
    //分页条件查询用户
    PageInfo<Version> conditionQueryPage(Integer pageNum, String conditions, String keywords);

    //插入
    int insertSelective(Version record);

    int deleteByPrimaryKey(int id);
}
