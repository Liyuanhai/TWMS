package com.gree.twms.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gree.twms.dao.AccountMapper;
import com.gree.twms.pojo.Account;
import com.gree.twms.pojo.AccountExample;
import com.gree.twms.service.IAccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public PageInfo<Account> conditionQueryPage(Integer pageNum, String conditions, String
            keywords) {
        if(pageNum==null||pageNum<=0){
            pageNum=1;
        }
        AccountExample accountExample=new AccountExample();
        Page<Account> pages= PageHelper.startPage(pageNum,10,true);
        if(conditions!=null&&keywords!=null){
            if("tID".equals(conditions)){
                accountExample.createCriteria().andTidLike( "%"+keywords+"%");
            }
            if("tModel".equals(conditions)){
                accountExample.createCriteria().andTmodelLike( "%"+keywords+"%");
            }
            if("borrowTime".equals(conditions)){
                accountExample.createCriteria().andBorrowtimeLike("%"+keywords+"%");
            }
            if("returnTime".equals(conditions)){
                accountExample.createCriteria().andReturntimeLike("%"+keywords+"%");
            }
            if("pName".equals(conditions)){
                accountExample.createCriteria().andPnameLike("%"+keywords+"%");
            }
        }
        accountExample.setOrderByClause("id");
        List<Account> accounts=accountMapper.selectByExample(accountExample);
        PageInfo<Account> pageInfo = new PageInfo<Account>();
        pageInfo.setList(accounts);
        pageInfo.setTotal(pages.getTotal());
        pageInfo.setPageNum(pageNum);
        pageInfo.setPages((int)pages.getTotal()/pages.getPageSize()+(pages.getTotal()%pages.getPageSize()==0?0:1));

        return  pageInfo;
    }

    @Override
    public int insertSelective(Account record) {
        return accountMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(int id) {
        return accountMapper.deleteByPrimaryKey(id);
    }
}
