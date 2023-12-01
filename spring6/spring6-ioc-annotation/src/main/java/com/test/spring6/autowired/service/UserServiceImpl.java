package com.test.spring6.autowired.service;

import com.test.spring6.autowired.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    // 注入dao
    // 第一种方式 属性注入
    // @Autowired
    // private UserDao userDao;

    //第二种方式 set注入
    //private UserDao userDao;

    //@Autowired
    //public void setUserDao(UserDao userDao) {
    //    this.userDao = userDao;
    //}

    //第三中方式 构造方法注入
    //private UserDao userDao;

    //@Autowired
    //public UserServiceImpl(UserDao userDao) {
    //    this.userDao = userDao;
    //}

    //第四种方式 形参上注入
    //private UserDao userDao;
    //
    //public UserServiceImpl(@Autowired UserDao userDao) {
    //    this.userDao = userDao;
    //}

    //方式五 只有一个有参数构造函数,无注解
    @Autowired
    @Qualifier(value = "userRedisDaoImpl")
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("service....");
        userDao.add();
    }
}
