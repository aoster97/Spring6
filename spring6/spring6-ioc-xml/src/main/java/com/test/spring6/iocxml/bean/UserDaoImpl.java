package com.test.spring6.iocxml.bean;

public class UserDaoImpl implements UserDao{

    @Override
    public void run() {
        System.out.println("Run...");
    }
}
