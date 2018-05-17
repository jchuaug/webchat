package com.xmu.middleware.service.impl;

import org.springframework.stereotype.Service;

import com.xmu.middleware.dao.T_userDao;
import com.xmu.middleware.pojo.T_user;
import com.xmu.middleware.service.UserService;

import javax.annotation.Resource;
import java.util.Set;

@Service("t_userService")
public class UserServiceImpl implements UserService {

    @Resource
    private T_userDao t_userDao ;

    @Override
    public T_user findUserByUsername(String username) {
        T_user t_user = t_userDao.findUserByUsername(username);
        return t_user;
    }

    @Override
    public Set<String> findRoles(String username) {
        return t_userDao.findRoles(username);
    }

    @Override
    public Set<String> findPermissions(String username) {
        return t_userDao.findPermissions(username);
    }
}
