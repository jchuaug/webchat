package com.xmu.middleware.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xmu.middleware.dao.ContentLogMapper;
import com.xmu.middleware.pojo.ContentLog;
import com.xmu.middleware.service.ContentLogService;

@Service
public class ContentLogServiceImpl implements ContentLogService {

    @Autowired
    private ContentLogMapper contentLogMapper;

    @Override
    public int insertSelective(ContentLog record) {

        return contentLogMapper.insertSelective(record);
    }
}
