package com.xmu.middleware.service.impl;

import org.springframework.stereotype.Service;

import com.xmu.middleware.dao.ContentDao;
import com.xmu.middleware.pojo.Content;
import com.xmu.middleware.service.ContentService;

import javax.annotation.Resource;
import java.util.List;

@Service("contentService")
public class ContentServiceImpl implements ContentService {

    @Resource
    public ContentDao contentDao ;

    @Override
    public List<Content> findContentList() {
        return contentDao.findContentList();
    }

    @Override
    public int insertSelective(Content content) {
        return contentDao.insertSelective(content);
    }
}
