package com.test.spring6.iocxml.auto.controller;

import com.test.spring6.iocxml.auto.service.UserService;

public class UserController {
    private UserService userService;

    public void setUserService(UserService userService) { this.userService = userService; }

    public void addUser(){
        System.out.println("controller方法执行了...");
        userService.addUserService();
        //controller中需要调用service的原生方法
//        UserService userService = new UserServiceImpl();
//        userService.addUserService();
    }

}
