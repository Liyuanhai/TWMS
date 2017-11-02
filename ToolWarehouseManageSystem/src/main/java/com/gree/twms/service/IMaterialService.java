package com.gree.twms.service;

import com.github.pagehelper.PageInfo;
import com.gree.twms.pojo.Material;

public interface IMaterialService {

    //分页条件查询用户
    PageInfo<Material> conditionQueryPage(Integer pageNum, String conditions, String keywords);

    //插入
    int insertSelective(Material record);

    int deleteByPrimaryKey(int id);

    Material selectByPrimaryKey(Integer id);
}
