package com.xmu.middleware.dao;

import java.util.List;

import com.xmu.middleware.pojo.Content;


public interface ContentDao {

    /**
     * 返回所有内容
     * @return
     */
    List<Content> findContentList();

    /**
     * 新增
     * @param content
     * @return
     */
    int insertSelective(Content content) ;

}
