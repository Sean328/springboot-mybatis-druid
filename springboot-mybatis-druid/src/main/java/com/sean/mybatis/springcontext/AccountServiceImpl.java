package com.sean.mybatis.springcontext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by sean on 2017/11/15.
 *
 * @author sean
 * @desc
 * @date 2017/11/15 16:01.
 */
@Component
public class AccountServiceImpl implements AccountService{
	@Override
	public void printHello() {
		System.out.println("Hello world!!!!");
	}
}
