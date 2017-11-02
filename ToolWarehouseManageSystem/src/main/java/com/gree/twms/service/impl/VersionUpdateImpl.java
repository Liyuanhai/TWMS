package com.gree.twms.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gree.twms.dao.VersionMapper;
import com.gree.twms.pojo.Version;
import com.gree.twms.pojo.VersionExample;
import com.gree.twms.service.IVersionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("versionService")
public class VersionUpdateImpl implements IVersionService {

    @Autowired
    private VersionMapper versionMapper;


    @Override
    public PageInfo<Version> conditionQueryPage(Integer pageNum, String conditions, String
            keywords) {
        if(pageNum==null||pageNum<=0){
            pageNum=1;
        }
        VersionExample versionExample=new VersionExample();
        Page<Version> pages= PageHelper.startPage(pageNum,10,true);
        if(conditions!=null&&keywords!=null){
            if("PCBID".equals(conditions)){
                versionExample.createCriteria().andPcbidLike( "%"+keywords+"%");
            }
            if("newVersion".equals(conditions)){
                versionExample.createCriteria().andNewversionLike( "%"+keywords+"%");
            }
        }
        versionExample.setOrderByClause("id");
        List<Version> versions=versionMapper.selectByExample(versionExample);
        PageInfo<Version> pageInfo = new PageInfo<Version>();
        pageInfo.setList(versions);
        pageInfo.setTotal(pages.getTotal());
        pageInfo.setPageNum(pageNum);
        pageInfo.setPages((int)pages.getTotal()/pages.getPageSize()+(pages.getTotal()%pages.getPageSize()==0?0:1));

        return  pageInfo;
    }

    @Override
    public int insertSelective(Version record) {
        return versionMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(int id) {
        return versionMapper.deleteByPrimaryKey(id);
    }
}
