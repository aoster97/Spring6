package com.test.spring6.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestUser {

    public static void main(String[] args) {

        ApplicationContext context = new
                ClassPathXmlApplicationContext("bean.xml");

        //1. 根据id获取获取bean
        User user1 = (User) context.getBean("user1");
        // User user4 = (User) context.getBean("user");
        // System.out.println("1. 根据id获取获取bean: " + user1);
        // System.out.println("1. 根据id获取获取bean: " + user4);

        //2. 根据类型获取bean
        //如果获取的对象的类路径是一样的,创建类的时候就hi
        User user2 = context.getBean(User.class);
        System.out.println("2. 根据类型获取bean: " + user2);

        //3. 根据 id 和 类型获取bean
        //User user3 = context.getBean("user", User.class);
        //System.out.println("3. 根据 id 和 类型获取bean" + user3);
    }

}
