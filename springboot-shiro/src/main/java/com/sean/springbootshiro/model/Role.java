package com.sean.springbootshiro.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sean on 2017/11/15.
 *
 * @author sean
 * @desc
 * @date 2017/11/15 9:49.
 */
public class Role implements Serializable{

	private Integer uid;
	private String rname;
	private Set<User> users = new HashSet<>();
	private Set<Module> modules = new HashSet<>();

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Set<Module> getModules() {
		return modules;
	}

	public void setModules(Set<Module> modules) {
		this.modules = modules;
	}
}
