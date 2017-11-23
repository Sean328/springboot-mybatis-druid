package com.sean.springbootshiro.service.impl;

import com.sean.springbootshiro.dao.UserMapper;
import com.sean.springbootshiro.model.User;
import com.sean.springbootshiro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sean on 2017/11/15.
 *
 * @author sean
 * @desc
 * @date 2017/11/15 10:04.
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;

	@Override
	public User findUserByUserName(String userName) {
		return userMapper.findByUserName(userName);
	}
}
