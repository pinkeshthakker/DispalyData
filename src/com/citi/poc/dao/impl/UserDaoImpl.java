package com.citi.poc.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.citi.poc.dao.UserDao;
import com.citi.poc.entity.User;

@Repository
public class UserDaoImpl extends AbstractDaoImpl<User, String> implements UserDao {

    protected UserDaoImpl() {
        super(User.class);
    }

	public List<User> getAllUserList() {

		return getUserList();
	}
}
