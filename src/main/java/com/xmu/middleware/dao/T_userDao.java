package com.xmu.middleware.dao;

import java.util.Set;

import com.xmu.middleware.pojo.T_user;

/**
 * Created with IDEA
 * Created by ${jie.chen} on 2016/7/14.
 */
public interface T_userDao {
    T_user findUserByUsername(String username);

    Set<String> findRoles(String username);

    Set<String> findPermissions(String username);
}
