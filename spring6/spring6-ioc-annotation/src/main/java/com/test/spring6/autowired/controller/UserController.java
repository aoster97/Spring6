package com.test.spring6.autowired.controller;

import com.test.spring6.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    // 注入 service
    // 第一种方式 属性注入
//    @Autowired //这个注解会根据对应的类型找到对应的对象
//    private UserService userService;

    //第二种方式 set注入
    //private UserService userService;
    //@Autowired
    //public void setUserService(UserService userService) {
    //    this.userService = userService;
    //}

    //第三种方式 构造方法上注入
    //private UserService userService;
    //
    //public UserController(UserService userService) {
    //    this.userService = userService;
    //}

    //第四种方式 形参上注入

    //private UserService userService;
//
    //public UserController(@Autowired UserService userService) {
    //    this.userService = userService;
    //}

    //第五方式 只有一个有参数构造函数,无注解
    //private UserService userService;
//
    //public UserController(UserService userService) {
    //    this.userService = userService;
    //}
    ////如果有其他的构造方法就会报错
    ////public UserController() {
    ////}

    //最后一种方式 两个注解 根据名称注入
    @Autowired
    private UserService userService;


    public void add() {
        System.out.println("controller.......");
        userService.add();
    }

}
