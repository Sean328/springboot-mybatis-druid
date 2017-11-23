package com.sean.springbootshiro.service;

import com.sean.springbootshiro.model.User;

/**
 * Created by sean on 2017/11/15.
 *
 * @author sean
 * @desc
 * @date 2017/11/15 10:02.
 */
public interface UserService {
	public User findUserByUserName(String userName);
}
