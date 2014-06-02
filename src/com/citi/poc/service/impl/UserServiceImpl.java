package com.citi.poc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.citi.poc.dao.UserDao;
import com.citi.poc.entity.User;
import com.citi.poc.service.UserService;

@Service("userService")
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

	public List<User> getAllUserList() {
		return userDao.getAllUserList();
	}
}
