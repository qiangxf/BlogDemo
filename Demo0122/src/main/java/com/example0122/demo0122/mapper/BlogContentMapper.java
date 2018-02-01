package com.example0122.demo0122.mapper;

import com.example0122.demo0122.entity.BlogContent;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
//提供内容的增删改查
public interface BlogContentMapper {
	//新增
	public void addContent(@Param("blogContent") BlogContent blogContent);
	//删除
	//public void delContent(@Param("blogContent") BlogContent blogContent);
	//修改
	//public void updateContent(@Param("blogContent") BlogContent blogContent);
	//查询
	public String findContent();
}
