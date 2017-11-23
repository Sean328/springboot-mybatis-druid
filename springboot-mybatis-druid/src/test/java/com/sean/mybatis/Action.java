package com.sean.mybatis;

import java.lang.annotation.*;

/**
 * Created by sean on 2017/11/21 15:27.
 *
 * @desc
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
	String name();
}
