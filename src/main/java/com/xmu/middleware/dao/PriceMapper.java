package com.xmu.middleware.dao;

import org.apache.ibatis.annotations.Param;

import com.xmu.middleware.pojo.Price;
import com.xmu.middleware.pojo.PriceExample;

import java.util.List;

public interface PriceMapper {
    int countByExample(PriceExample example);

    int deleteByExample(PriceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Price record);

    int insertSelective(Price record);

    List<Price> selectByExample(PriceExample example);

    Price selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Price record, @Param("example") PriceExample example);

    int updateByExample(@Param("record") Price record, @Param("example") PriceExample example);

    int updateByPrimaryKeySelective(Price record);

    int updateByPrimaryKey(Price record);
}