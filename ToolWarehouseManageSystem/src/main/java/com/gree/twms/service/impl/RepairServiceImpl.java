package com.gree.twms.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gree.twms.dao.RepairMapper;
import com.gree.twms.pojo.Repair;
import com.gree.twms.pojo.RepairExample;
import com.gree.twms.service.IRepairService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("repairService")
public class RepairServiceImpl implements IRepairService {

    @Autowired
    private RepairMapper repairMapper;

    @Override
    public PageInfo<Repair> conditionQueryPage(Integer pageNum, String conditions, String
            keywords) {
        if(pageNum==null||pageNum<=0){
            pageNum=1;
        }
        RepairExample repairExample=new RepairExample();
        Page<Repair> pages= PageHelper.startPage(pageNum,10,true);
        if(conditions!=null&&keywords!=null){
            if("tID".equals(conditions)){
                repairExample.createCriteria().andTidLike( "%"+keywords+"%");
            }

            if("tModel".equals(conditions)){
                repairExample.createCriteria().andTmodelLike("%"+keywords+"%");
            }
        }
        repairExample.setOrderByClause("id");
        List<Repair> repairs=repairMapper.selectByExample(repairExample);
        PageInfo<Repair> pageInfo = new PageInfo<Repair>();
        pageInfo.setList(repairs);
        pageInfo.setTotal(pages.getTotal());
        pageInfo.setPageNum(pageNum);
        pageInfo.setPages((int)pages.getTotal()/pages.getPageSize()+(pages.getTotal()%pages.getPageSize()==0?0:1));

        return  pageInfo;
    }

    @Override
    public int insertSelective(Repair record) {
        return repairMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(int id) {
        return repairMapper.deleteByPrimaryKey(id);
    }
}
