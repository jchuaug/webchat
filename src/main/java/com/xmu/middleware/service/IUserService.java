package com.xmu.middleware.service;


import java.util.List;
import java.util.Map;

import com.xmu.middleware.pojo.User;
import com.xmu.middleware.util.Page;

public interface IUserService {

    User getUserById(int userId);

    int createUser(User user);

    User findByLogin(User user);

    Page<User> findByParams(User u, int pageNo, int limit);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int findAllCount(User u);

    List<User> findHotUser();

    List<User> findAllByQuery(User user);

    /**
     * 分页查询
     *
     * @param map
     * @return
     */
    List<User> list(Map<String, Object> map);

    /**
     * 获取全部
     * @param map
     * @return
     */
    Long getTotal(Map<String, Object> map);


    /**
     * Shiro的登录验证，通过用户名查询用户信息
     *
     * @param username
     * @return
     */
    User findUserByUsername(String username);

}
