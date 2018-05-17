package com.xmu.middleware.dao;

import org.apache.ibatis.annotations.Param;

import com.xmu.middleware.pojo.RedisContent;
import com.xmu.middleware.pojo.RedisContentExample;

import java.util.List;

public interface RediscontentMapper {
    int countByExample(RedisContentExample example);

    int deleteByExample(RedisContentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RedisContent record);

    int insertSelective(RedisContent record);

    List<RedisContent> selectByExample(RedisContentExample example);

    RedisContent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RedisContent record, @Param("example") RedisContentExample example);

    int updateByExample(@Param("record") RedisContent record, @Param("example") RedisContentExample example);

    int updateByPrimaryKeySelective(RedisContent record);

    int updateByPrimaryKey(RedisContent record);
}