package com.test.spring6.iocxml;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    private Logger logger = LoggerFactory.getLogger(TestUser.class);

    @Test
    public void testUserObject() {
        // 加载spring的配置文件,进行对象的创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 获取创建的对象
        User user = (User) context.getBean("user");
        System.out.println(user);

        // 使用对象调用方法进行测试
        user.add();

        //手动写入日志
        logger.info("##### 调用成功了");

    }

    //反射创建对象
    @Test
    public void testUserObject1() throws Exception {
        //获取类Class对象
        Class clazz = Class.forName("com.test.spring6.iocxml.User");
        //调用方法创建对象
        //Object o = clazz.newInstance();
        User user = (User) clazz.getDeclaredConstructor().newInstance();
        System.out.println(user);
    }

}
