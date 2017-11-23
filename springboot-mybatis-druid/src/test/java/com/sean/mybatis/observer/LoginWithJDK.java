package com.sean.mybatis.observer;

import java.util.Observable;

/**
 * Created by sean on 2017/11/23 9:28.
 * 这是一个继承了Observable的观察者模式，改类为被观察者
 * @desc
 */
public class LoginWithJDK extends Observable {

	public static void main(String[] args) {
		LoginWithJDK loginWithJDK = new LoginWithJDK();
		ObserverWithJDK observeTest = new ObserverWithJDK(loginWithJDK);

		loginWithJDK.loginSuccess();

	}


	public void loginSuccess(){
		System.out.println("登录成功，通知观察者...");
		setChanged();
		notifyObservers();
	}
}
