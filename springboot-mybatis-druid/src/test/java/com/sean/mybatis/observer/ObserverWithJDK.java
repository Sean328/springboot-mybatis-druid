package com.sean.mybatis.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by sean on 2017/11/23 9:31.
 *
 * @desc 改类为观察者类，当被观察者发生变化时调用update方法
 */
public class ObserverWithJDK implements Observer{

	public ObserverWithJDK(LoginWithJDK loginWithJDK){
		loginWithJDK.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("被观察者的方法被触发");
	}
}
