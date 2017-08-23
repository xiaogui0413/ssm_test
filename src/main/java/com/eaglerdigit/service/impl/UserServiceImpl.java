package com.eaglerdigit.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eaglerdigit.dao.UserDao;
import com.eaglerdigit.entity.User;
import com.eaglerdigit.service.UserService;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService{

    @Resource
    private UserDao userDao;
    
	@Override
	public User getUserById(Integer userid) {
		return userDao.selectByPrimaryKey(userid);
	}

	@Override
	public int insert(User user) {
		return userDao.insert(user);
	}

}
