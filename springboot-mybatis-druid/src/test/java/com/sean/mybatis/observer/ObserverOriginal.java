package com.sean.mybatis.observer;

/**
 * Created by sean on 2017/11/23 9:58.
 *
 * @desc
 */
public class ObserverOriginal implements LoginInterface{

	public ObserverOriginal(LoginOriginal loginOriginal){
		loginOriginal.addObject(this);
	}

	@Override
	public void onSuccess(Object object) {
		System.out.println("hehehehehehehhehe");
	}
}
