package com.gree.twms.service;

import com.github.pagehelper.PageInfo;
import com.gree.twms.pojo.Review;

public interface IReviewService {

    //分页条件查询用户
    PageInfo<Review> conditionQueryPage(Integer pageNum, String conditions, String keywords);

    //插入
    int insertSelective(Review record);

    int deleteByPrimaryKey(int id);

    Review selectByPrimaryKey(Integer id);
}
