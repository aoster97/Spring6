package com.test.spring6.iocxml.auto.service;

import com.test.spring6.iocxml.auto.dao.UserDao;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) { this.userDao = userDao; }


    @Override
    public void addUserService() {
        System.out.println("userService方法执行了...");
        userDao.addUserDao();
//      UserDao userDao = new UserDaoImpl();
//      userDao.addUserDao();
    }

    ;
}
