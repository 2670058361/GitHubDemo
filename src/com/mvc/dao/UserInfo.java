package com.mvc.dao;

import java.util.List;

public class UserInfo {
	private String name;
	private String pwd;
	private String yhm;
	private String gz;
	private List<String> list;
	private String[] tc;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getYhm() {
		return yhm;
	}
	public void setYhm(String yhm) {
		this.yhm = yhm;
	}
	public String getGz() {
		return gz;
	}
	public void setGz(String gz) {
		this.gz = gz;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public String[] getTc() {
		return tc;
	}
	public void setTc(String[] tc) {
		this.tc = tc;
	}
	public UserInfo(String name, String pwd, String yhm, String gz,
			List<String> list, String[] tc) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.yhm = yhm;
		this.gz = gz;
		this.list = list;
		this.tc = tc;
	}
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
