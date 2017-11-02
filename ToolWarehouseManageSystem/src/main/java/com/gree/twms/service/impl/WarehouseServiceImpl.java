package com.gree.twms.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gree.twms.dao.WarehouseMapper;
import com.gree.twms.pojo.UserExample;
import com.gree.twms.pojo.Warehouse;
import com.gree.twms.pojo.WarehouseExample;
import com.gree.twms.service.IWarehouseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("warehouseService")
public class WarehouseServiceImpl implements IWarehouseService{
    @Autowired
    private WarehouseMapper warehouseMapper;

    @Override
    public PageInfo<Warehouse> conditionQueryPage(Integer pageNum, String conditions, String keywords) {
        if(pageNum==null||pageNum<=0){
            pageNum=1;
        }
        WarehouseExample warehouseExample=new WarehouseExample();
        Page<Warehouse> pages= PageHelper.startPage(pageNum,10,true);
        if(conditions!=null&&keywords!=null){
            if("sID".equals(conditions)){
                warehouseExample.createCriteria().andSidLike( "%"+keywords+"%");
            }
            if("tID".equals(conditions)){
                warehouseExample.createCriteria().andTidLike( "%"+keywords+"%");
            }
        }
        warehouseExample.setOrderByClause("sID");
        List<Warehouse> Warehouses= warehouseMapper.selectByExample(warehouseExample);
        PageInfo<Warehouse> pageInfo = new PageInfo<Warehouse>();
        pageInfo.setList(Warehouses);
        pageInfo.setTotal(pages.getTotal());
        pageInfo.setPageNum(pageNum);
        pageInfo.setPages((int)pages.getTotal()/pages.getPageSize()+(pages.getTotal()%pages.getPageSize()==0?0:1));

        return  pageInfo;
    }

    @Override
    public int countByPid(String sID) {
        if(sID != null){
            WarehouseExample warehouseExample=new WarehouseExample();
            warehouseExample.createCriteria().andSidEqualTo(sID);
            return warehouseMapper.countByExample(warehouseExample);
        }
        return 0;
    }

    @Override
    public int updateByPid(Warehouse record) {
        if(record!=null) {
            if(record.getSid()!=null){
                return warehouseMapper.updateByPrimaryKeySelective(record);
            }
        }
        return 0;
    }

    @Override
    public int insertSelective(Warehouse record) {
        return warehouseMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(String sid) {
        return warehouseMapper.deleteByPrimaryKey(sid);
    }
}
