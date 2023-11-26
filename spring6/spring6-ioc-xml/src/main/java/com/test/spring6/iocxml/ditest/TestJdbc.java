package com.test.spring6.iocxml.ditest;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

    @Test
    public void testJdbc() throws Exception {
        Connection com = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/spring6_learn?serverTimezone=UTC&characterEncoding=utf-8&useUnicode=true&useSSL=false",
                "root",
                "12345678");
        System.out.println(com);
    }
}
