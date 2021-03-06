package com.sean.springbootshiro.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sean on 2017/11/15.
 *
 * @author sean
 * @desc
 * @date 2017/11/15 9:51.
 */
public class Module implements Serializable {
	private Integer uid;
	private String mname;
	private Set<Role> roles = new HashSet<>();

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
}
