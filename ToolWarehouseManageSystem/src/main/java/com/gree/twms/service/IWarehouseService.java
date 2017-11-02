package com.gree.twms.service;

import com.github.pagehelper.PageInfo;
import com.gree.twms.pojo.Warehouse;

public interface IWarehouseService {
    //分页条件查询用户
    PageInfo<Warehouse> conditionQueryPage(Integer pageNum, String conditions, String keywords);

    //按条件统计数量
    int countByPid(String sID);

    int updateByPid(Warehouse record);

    //插入
    int insertSelective(Warehouse record);

    int deleteByPrimaryKey(String sid);
}
