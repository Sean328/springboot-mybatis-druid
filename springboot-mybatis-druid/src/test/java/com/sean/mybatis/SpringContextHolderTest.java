package com.sean.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Observable;
import java.util.Observer;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by sean on 2017/11/15.
 *
 * @author sean
 * @desc
 * @date 2017/11/15 15:58.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class SpringContextHolderTest implements Observer{

//	private SpringContextHolder springContextHolder;

	@Test
	public void testSpring() {
//		AccountService accountService = SpringContextHolder.getBean("accountServiceImpl");
//		assertNotNull(accountService);
//		accountService.printHello();
	}

	@Override
	public void update(Observable o, Object arg) {

	}
}
