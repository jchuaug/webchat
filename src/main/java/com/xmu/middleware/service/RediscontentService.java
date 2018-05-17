package com.xmu.middleware.service;

import java.util.List;

import com.xmu.middleware.pojo.RedisContent;
import com.xmu.middleware.pojo.RedisContentExample;
import com.xmu.middleware.util.PageEntity;

public interface RediscontentService {
    List<RedisContent> selectByExample(RedisContentExample example);

    RedisContent selectByPrimaryKey(Integer id);

    PageEntity<RedisContent> selectByPage(Integer pageNum, Integer pageSize);

}
