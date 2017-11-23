package com.sean.mybatis.controller;

import com.sean.mybatis.mapper.UserMapper;
import com.sean.mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sean on 2017/11/14.
 *
 * @author sean
 * @desc
 * @date 2017/11/14 15:38.
 */
@RestController
@RequestMapping("/user/*")
public class UserController {

	@SuppressWarnings("all")
	@Autowired
	UserMapper userMapper;

	@GetMapping("list")
	public List<User> list() {
		return userMapper.list();
	}

	@GetMapping("list/{username}")
	public List<User> listByUsername(@PathVariable("username") String username) {
		return userMapper.listByUsername(username);
	}

	@GetMapping("get/{username}/{password}")
	public User get(@PathVariable("username") String username, @PathVariable("password") String password) {
		return userMapper.get(username, password);
	}

	@GetMapping("get/bad/{username}/{password}")
	public User getBadUser(@PathVariable("username") String username, @PathVariable("password") String password) {
		return userMapper.getBadUser(username, password);
	}

}