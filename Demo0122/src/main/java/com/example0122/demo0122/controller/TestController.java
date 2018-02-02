package com.example0122.demo0122.controller;

import com.example0122.demo0122.entity.BlogContent;
import com.example0122.demo0122.mapper.BlogContentMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example0122.demo0122.entity.User;

import javax.annotation.Resource;

/**
 * @author qxf
 * */

@RestController
public class TestController {
	//定义一个全局的博客内容变量
	String blogContent;
	
	@Resource
	public BlogContentMapper blogContentMapper;
	
	@RequestMapping(value = "/testMapping",method = RequestMethod.POST)
	public BlogContent findAll(@RequestParam(value = "username",required = false,defaultValue = "1111") String textArea,
				@RequestParam(value="password",required=false,defaultValue="222") String password,@RequestParam(value="addTime",required = false,defaultValue="3333") String addTime) {
		String text = textArea;
		String text2 = password;
		String text3 = addTime;
		BlogContent blogContent = new BlogContent();
		blogContent.setBlogHtml(text);
		blogContent.setBlogContent(text2);
		blogContent.setAddTime(text3);
		blogContentMapper.addContent(blogContent);
		return blogContent;
	}
	
	@RequestMapping(value="/showBlog",method=RequestMethod.POST)
	public String showAll(@RequestParam(value="blogHtml",required = false,defaultValue="asdsadas") String blogHtml) {
		BlogContent blog = new BlogContent();
		blog.setAddTime(blogHtml);
		String blogContent = blogContentMapper.findContent(blog);	
		return blogContent;
	}

	@RequestMapping(value = "/showMapping",method = RequestMethod.GET)
	public String getContent(@RequestParam(value = "content",required = false,defaultValue = "2222") String content){
		System.out.println("后台接受的值是："+content);
		blogContent = content;
		return "成功";
	}
}
