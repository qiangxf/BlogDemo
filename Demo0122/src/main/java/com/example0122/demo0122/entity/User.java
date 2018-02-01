package com.example0122.demo0122.entity;

public class User {
	private String sex;
	private String year;
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public User(String sex, String year) {
		super();
		this.sex = sex;
		this.year = year;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
