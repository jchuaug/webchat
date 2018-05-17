package com.xmu.middleware.service;

import com.xmu.middleware.pojo.ContentLog;


public interface ContentLogService {

    /**
     * 根据条件新增
     * @param record
     * @return
     */
    int insertSelective(ContentLog record);
}
