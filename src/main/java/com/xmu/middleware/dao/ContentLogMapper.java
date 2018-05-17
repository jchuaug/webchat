package com.xmu.middleware.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.xmu.middleware.pojo.ContentLog;
import com.xmu.middleware.pojo.ContentLogExample;

public interface ContentLogMapper {
    int countByExample(ContentLogExample example);

    int deleteByExample(ContentLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(ContentLog record);

    int insertSelective(ContentLog record);

    List<ContentLog> selectByExample(ContentLogExample example);

    ContentLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") ContentLog record, @Param("example") ContentLogExample example);

    int updateByExample(@Param("record") ContentLog record, @Param("example") ContentLogExample example);

    int updateByPrimaryKeySelective(ContentLog record);

    int updateByPrimaryKey(ContentLog record);
}