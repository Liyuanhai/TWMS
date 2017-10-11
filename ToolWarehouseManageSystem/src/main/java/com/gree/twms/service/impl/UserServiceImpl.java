package com.gree.twms.service.impl;

import com.gree.twms.dao.UserMapper;
import com.gree.twms.pojo.User;
import com.gree.twms.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectIsValidUser(User user) {
        User result = userMapper.selectIsValidUser(user);
        return result;
    }

    @Override
    public int insertSelective(User record) {
        int result = userMapper.insertSelective(record);
        return 0;
    }

    @Override
    public List<User> selectAllUser() {
        List<User> users = userMapper.selectAllUser();
        return users;
    }


}
