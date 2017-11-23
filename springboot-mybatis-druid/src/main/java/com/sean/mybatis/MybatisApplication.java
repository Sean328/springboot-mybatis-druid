package com.sean.mybatis;

import com.sean.mybatis.springcontext.AccountService;
import com.sean.mybatis.utils.SpringContextHolder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static junit.framework.TestCase.assertNotNull;

@SpringBootApplication
public class MybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisApplication.class, args);
		AccountService accountService = SpringContextHolder.getBean("accountServiceImpl");
		accountService.printHello();
	}
}
