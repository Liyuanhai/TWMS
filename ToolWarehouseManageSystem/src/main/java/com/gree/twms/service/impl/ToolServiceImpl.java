package com.gree.twms.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gree.twms.dao.ToolMapper;
import com.gree.twms.pojo.Tool;
import com.gree.twms.pojo.ToolExample;
import com.gree.twms.service.IToolService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("toolService")
public class ToolServiceImpl implements IToolService{

    @Autowired
    private ToolMapper toolMapper;

    @Override
    public int insertSelective(Tool record) {
        return toolMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(String tid) {
        return toolMapper.deleteByPrimaryKey(tid);
    }

    @Override
    public PageInfo<Tool> conditionQueryPage(Integer pageNum, String conditions, String keywords) {
        if(pageNum==null||pageNum<=0){
            pageNum=1;
        }
        ToolExample toolExample=new ToolExample();
        Page<Tool> pages= PageHelper.startPage(pageNum,10,true);
        if(conditions!=null&&keywords!=null){
            if("tID".equals(conditions)){
                toolExample.createCriteria().andTidLike( "%"+keywords+"%");
            }
            if("tModel".equals(conditions)){
                toolExample.createCriteria().andTmodelLike( "%"+keywords+"%");
            }
            if("makeTime".equals(conditions)){
                toolExample.createCriteria().andMaketimeLike("%"+keywords+"%");
            }
        }
        toolExample.setOrderByClause("tID");
        List<Tool> tools=toolMapper.selectByExample(toolExample);
        PageInfo<Tool> pageInfo = new PageInfo<Tool>();
        pageInfo.setList(tools);
        pageInfo.setTotal(pages.getTotal());
        pageInfo.setPageNum(pageNum);
        pageInfo.setPages((int)pages.getTotal()/pages.getPageSize()+(pages.getTotal()%pages.getPageSize()==0?0:1));

        return  pageInfo;
    }

    @Override
    public int countByPid(String tID) {
        if(tID != null){
            ToolExample toolExample=new ToolExample();
            toolExample.createCriteria().andTidEqualTo(tID);
            return toolMapper.countByExample(toolExample);
        }
        return 0;
    }

    @Override
    public int updateByPid(Tool record) {
        if(record!=null) {
            if(record.getTid()!=null){
                return toolMapper.updateByPrimaryKeySelective(record);
            }
        }
        return 0;
    }
}
