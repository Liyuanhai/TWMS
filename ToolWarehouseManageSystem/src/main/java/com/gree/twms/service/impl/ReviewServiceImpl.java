package com.gree.twms.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gree.twms.dao.ReviewMapper;
import com.gree.twms.pojo.Review;
import com.gree.twms.pojo.ReviewExample;
import com.gree.twms.service.IReviewService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("reviewService")
public class ReviewServiceImpl implements IReviewService {

    @Autowired
    private ReviewMapper reviewMapper;

    @Override
    public PageInfo<Review> conditionQueryPage(Integer pageNum, String conditions, String
            keywords) {
        if(pageNum==null||pageNum<=0){
            pageNum=1;
        }
        ReviewExample reviewExample=new ReviewExample();
        Page<Review> pages= PageHelper.startPage(pageNum,10,true);
        if(conditions!=null&&keywords!=null){
            if("tID".equals(conditions)){
                reviewExample.createCriteria().andTidLike( "%"+keywords+"%");
            }
            if("tName".equals(conditions)){
                reviewExample.createCriteria().andTnameLike( "%"+keywords+"%");
            }
            if("PCBModel".equals(conditions)){
                reviewExample.createCriteria().andPcbmodelLike("%"+keywords+"%");
            }
            if("conclusion".equals(conditions)){
                reviewExample.createCriteria().andConclusionLike("%"+keywords+"%");
            }
        }
        reviewExample.setOrderByClause("id");
        List<Review> reviews=reviewMapper.selectByExample(reviewExample);
        PageInfo<Review> pageInfo = new PageInfo<Review>();
        pageInfo.setList(reviews);
        pageInfo.setTotal(pages.getTotal());
        pageInfo.setPageNum(pageNum);
        pageInfo.setPages((int)pages.getTotal()/pages.getPageSize()+(pages.getTotal()%pages.getPageSize()==0?0:1));

        return  pageInfo;
    }

    @Override
    public int insertSelective(Review record) {
        return reviewMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(int id) {
        return reviewMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Review selectByPrimaryKey(Integer id) {
        return reviewMapper.selectByPrimaryKey(id);
    }
}
