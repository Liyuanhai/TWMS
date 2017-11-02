package com.gree.twms.service;

import com.github.pagehelper.PageInfo;
import com.gree.twms.pojo.Tool;

public interface IToolService {
    //插入Tool
    int insertSelective(Tool record);


    //删除用户
    int deleteByPrimaryKey(String tid);

    //分页条件查询用户
    PageInfo<Tool> conditionQueryPage(Integer pageNum, String conditions, String keywords);

    //按条件统计数量
    int countByPid(String pID);

    int updateByPid(Tool record);
}
