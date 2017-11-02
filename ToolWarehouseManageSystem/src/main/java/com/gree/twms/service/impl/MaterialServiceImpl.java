package com.gree.twms.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gree.twms.dao.MaterialMapper;
import com.gree.twms.pojo.Material;
import com.gree.twms.pojo.MaterialExample;
import com.gree.twms.service.IMaterialService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("materialService")
public class MaterialServiceImpl implements IMaterialService {

    @Autowired
    private MaterialMapper materialMapper;

    @Override
    public PageInfo<Material> conditionQueryPage(Integer pageNum, String conditions, String
            keywords) {
        if(pageNum==null||pageNum<=0){
            pageNum=1;
        }
        MaterialExample materialExample=new MaterialExample();
        Page<Material> pages= PageHelper.startPage(pageNum,10,true);
        if(conditions!=null&&keywords!=null){
            if("tName".equals(conditions)){
                materialExample.createCriteria().andTnameLike( "%"+keywords+"%");
            }

            if("tModel".equals(conditions)){
                materialExample.createCriteria().andTmodelLike("%"+keywords+"%");
            }
        }
        materialExample.setOrderByClause("id");
        List<Material> materials=materialMapper.selectByExample(materialExample);
        PageInfo<Material> pageInfo = new PageInfo<Material>();
        pageInfo.setList(materials);
        pageInfo.setTotal(pages.getTotal());
        pageInfo.setPageNum(pageNum);
        pageInfo.setPages((int)pages.getTotal()/pages.getPageSize()+(pages.getTotal()%pages.getPageSize()==0?0:1));

        return  pageInfo;
    }

    @Override
    public int insertSelective(Material record) {
        return materialMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(int id) {
        return materialMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Material selectByPrimaryKey(Integer id) {
        return materialMapper.selectByPrimaryKey(id);
    }
}
