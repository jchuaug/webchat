package com.xmu.middleware.service;
/*
 * @author 82526
 *
 */

import java.util.List;

import com.xmu.middleware.pojo.Content;

public interface ContentService {
	/**
	 * 获取内容List
	 * 
	 * @return
	 */
	List<Content> findContentList();

	/**
	 * 根据条件新增
	 * 
	 * @param content
	 * @return
	 */
	int insertSelective(Content content);

}
