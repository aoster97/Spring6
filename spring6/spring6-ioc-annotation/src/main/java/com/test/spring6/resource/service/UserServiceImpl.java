package com.test.spring6.resource.service;

import com.test.spring6.resource.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Override
    public void add() {
        System.out.println("service....");
        userDao.add();
    }
}
