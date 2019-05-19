package com.mvc.dao;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

public class Degree {
	@Length(min=2,max=4,message="2-4Œª")
	private String name;
	@Pattern(regexp="^[1-100]",message="ƒÍ¡‰1-100")
	private String age;
	@Length(min=16,max=16,message="16Œª")
	private String dianhua;
	private String Wenhua;
	private String a1;
	private String a2;
	private String a3;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDianhua() {
		return dianhua;
	}
	public void setDianhua(String dianhua) {
		this.dianhua = dianhua;
	}
	public String getWenhua() {
		return Wenhua;
	}
	public void setWenhua(String wenhua) {
		Wenhua = wenhua;
	}
	public String getA1() {
		return a1;
	}
	public void setA1(String a1) {
		this.a1 = a1;
	}
	public String getA2() {
		return a2;
	}
	public void setA2(String a2) {
		this.a2 = a2;
	}
	public String getA3() {
		return a3;
	}
	public void setA3(String a3) {
		this.a3 = a3;
	}
	public Degree(String name, String age, String dianhua, String wenhua,
			String a1, String a2, String a3) {
		super();
		this.name = name;
		this.age = age;
		this.dianhua = dianhua;
		Wenhua = wenhua;
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
	}
	public Degree() {
		super();
		// TODO Auto-generated constructor stub
	}

}
