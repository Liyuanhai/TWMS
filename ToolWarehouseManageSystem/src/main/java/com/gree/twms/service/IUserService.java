package com.gree.twms.service;


import com.gree.twms.pojo.User;


public interface IUserService {

    User selectIsValidUser(String username,String password);

}