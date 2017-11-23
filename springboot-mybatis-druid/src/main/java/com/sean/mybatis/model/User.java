package com.sean.mybatis.model;

/**
 * Created by sean on 2017/11/14.
 *
 * @author sean
 * @desc
 * @date 2017/11/14 15:34.
 */
public class User {

	private String userId;
	private String username;
	private String password;
	private String mobileNum;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
}
