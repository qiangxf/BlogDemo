package com.example0122.demo0122.entity;

public class BlogContent {
	//博客内容
	private String blogContent;
	//博客html
	private String blogHtml;
	//主键id
	private Integer Id;
	//新增时间id
	private String addTime;

	public String getBlogContent() {
		return blogContent;
	}
	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}
	public String getBlogHtml() {
		return blogHtml;
	}
	public void setBlogHtml(String blogHtml) {
		this.blogHtml = blogHtml;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getAddTime() {
		return addTime;
	}
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
	
	
	
	
	
}
