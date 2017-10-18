package com.gree.twms.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gree.twms.dao.UserMapper;
import com.gree.twms.pojo.User;
import com.gree.twms.pojo.UserExample;
import com.gree.twms.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectIsValidUser(User user) {
        UserExample example=new UserExample();
        if(user!=null){
          UserExample.Criteria criterion= example.createCriteria();
            if(user.getPid()!=null){
                criterion.andPidEqualTo(user.getPid());
            }

            if(user.getPwd()!=null){
                criterion.andPwdEqualTo(user.getPwd());
            }
        }
        List<User> users=userMapper.selectByExample(example);
        if(users!=null&&users.size()>0){
            return  users.get(0);
        }
        return null;
    }

    @Override
//    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

//    @Override
//    public List<User> selectAllUser() {
//        UserExample userExample = new UserExample();
//
//        return userMapper.selectAllUser();
//    }

    @Override
    public int deleteByPrimaryKey(String pid) {
        int result = userMapper.deleteByPrimaryKey(pid);
        return result;
    }

    @Override
    public PageInfo<User> conditionQueryPage(Integer pageNum, String conditions, String keywords) {
        if(pageNum==null||pageNum<=0){
            pageNum=1;
        }
        UserExample userExample=new UserExample();
        Page<User> pages=PageHelper.startPage(pageNum,10,true);
        if(conditions!=null&&keywords!=null){
            if("pID".equals(conditions)){
                userExample.createCriteria().andPidLike( "%"+keywords+"%");
            }
            if("pName".equals(conditions)){
                userExample.createCriteria().andPnameLike( "%"+keywords+"%");
            }
        }
        userExample.setOrderByClause("pID");
        List<User> users=userMapper.selectByExample(userExample);
        PageInfo<User> pageInfo = new PageInfo<User>();
        pageInfo.setList(users);
        pageInfo.setTotal(pages.getTotal());
        pageInfo.setPageNum(pageNum);
        pageInfo.setPages((int)pages.getTotal()/pages.getPageSize()+(pages.getTotal()%pages.getPageSize()==0?0:1));

        return  pageInfo;
    }

    @Override
    public int countByPid(String pID) {
        if(pID != null){
            UserExample userExample=new UserExample();
            userExample.createCriteria().andPidEqualTo(pID);
            return userMapper.countByExample(userExample);
        }
        return 0;
    }

    @Override
    public int updateByPid(User record) {
        if(record!=null) {
            if(record.getPid()!=null){
                return userMapper.updateByPrimaryKeySelective(record);
            }
        }
        return 0;
    }
}
