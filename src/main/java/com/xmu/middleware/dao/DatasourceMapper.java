package com.xmu.middleware.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xmu.middleware.pojo.Datasource;
import com.xmu.middleware.pojo.DatasourceExample;

public interface DatasourceMapper {
    int countByExample(DatasourceExample example);

    int deleteByExample(DatasourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Datasource record);

    int insertSelective(Datasource record);

    List<Datasource> selectByExample(DatasourceExample example);

    Datasource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Datasource record, @Param("example") DatasourceExample example);

    int updateByExample(@Param("record") Datasource record, @Param("example") DatasourceExample example);

    int updateByPrimaryKeySelective(Datasource record);

    int updateByPrimaryKey(Datasource record);
}