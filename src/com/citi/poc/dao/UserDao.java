package com.citi.poc.dao;

import com.citi.poc.entity.User;

import java.util.List;

public interface UserDao extends AbstractDao<User, String> {
    
    List<User> getAllUserList();
}
