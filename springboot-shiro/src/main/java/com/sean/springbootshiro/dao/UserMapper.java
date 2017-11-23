package com.sean.springbootshiro.dao;

import com.sean.springbootshiro.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by sean on 2017/11/15.
 *
 * @author sean
 * @desc
 * @date 2017/11/15 9:59.
 */
public interface UserMapper {

	public User findByUserName(String userName);
}
