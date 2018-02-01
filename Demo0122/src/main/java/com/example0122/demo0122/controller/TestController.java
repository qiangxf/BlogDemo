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

	@Resource
	public BlogContentMapper blogContentMapper;
	
	@RequestMapping(value = "/testMapping",method = RequestMethod.POST)
	public BlogContent findAll(@RequestParam(value = "username",required = false,defaultValue = "1111") String textArea,
				@RequestParam(value="password",required=false,defaultValue="222") String password) {
		String text = textArea;
		String text2 = password;
		System.out.println(text);
		System.out.println(text2);
		BlogContent blogContent = new BlogContent();
		blogContent.setBlogHtml(text);
		blogContent.setBlogContent(text2);
		blogContentMapper.addContent(blogContent);
		return blogContent;
	}
	
	@RequestMapping(value="/showBlog",method=RequestMethod.POST)
	public String showAll() {
		return "<h2 id=\"h2-u6D4Bu8BD5\"><a name=\"测试\" class=\"reference-link\"></a><span class=\"header-link octicon octicon-link\"></span>测试</h2><p>大萨达撒大萨达撒阿达撒打算啊实打实多撒啊实打实大所阿达撒打算</p>\r\n" + 
				"<pre><code>public void main(String [] args){\r\n" + 
				"    test main;\r\n" + 
				"}\r\n" + 
				"</code></pre>";
	}
}
