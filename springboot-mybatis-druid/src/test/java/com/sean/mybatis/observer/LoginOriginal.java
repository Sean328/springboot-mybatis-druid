package com.sean.mybatis.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sean on 2017/11/23 9:57.
 *
 * @desc
 */
public class LoginOriginal{

	private List<LoginInterface> loginInterfaces = new ArrayList<>();

	public void addObject(LoginInterface addObject){
		loginInterfaces.add(addObject);
	}

	private void loginSuccess(){
		for (LoginInterface loginInterface : loginInterfaces) {
			loginInterface.onSuccess(this);
		}
	}

	public static void main(String[] args) {
		LoginOriginal loginOriginal = new LoginOriginal();
		ObserverOriginal observerOriginal = new ObserverOriginal(loginOriginal);
		loginOriginal.loginSuccess();
	}

}
