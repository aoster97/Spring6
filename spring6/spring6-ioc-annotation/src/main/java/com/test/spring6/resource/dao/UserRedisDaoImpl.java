package com.test.spring6.resource.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserRedisDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("Dao redis.......");
    }
}
