package com.gree.twms.service;

import com.github.pagehelper.PageInfo;
import com.gree.twms.pojo.Repair;

public interface IRepairService {

    //分页条件查询用户
    PageInfo<Repair> conditionQueryPage(Integer pageNum, String conditions, String keywords);

    //插入
    int insertSelective(Repair record);

    int deleteByPrimaryKey(int id);
}
