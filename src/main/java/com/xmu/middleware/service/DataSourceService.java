package com.xmu.middleware.service;

import java.util.List;

import com.xmu.middleware.pojo.Datasource;
import com.xmu.middleware.pojo.DatasourceExample;

/**
 * Function:
 *
 * @author chenjiec
 *         Date: 2016/12/9 上午12:16
 * @since JDK 1.7
 */
public interface DataSourceService {

    /**
     * 根据条件查询
     * @param example
     * @return
     */
    List<Datasource> selectByExample(DatasourceExample example);

    /**
     * 根据主键查询
     * @param id
     * @return
     */
    Datasource selectByPrimaryKey(Integer id);


}
