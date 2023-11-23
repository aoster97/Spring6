package com.test.spring6.iocxml.bean;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDao {

    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(TestUserDao.class);
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");

        //根据类型获取接口对应的bean
        UserDao userDao = context.getBean(UserDao.class);
        System.out.println(userDao);
        userDao.run();

        logger.info("##调用成功...");


    }
}
