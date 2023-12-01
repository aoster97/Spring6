package com.test.spring6.resource.controller;

import com.test.spring6.resource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {



    public void add() {
        System.out.println("controller.......");
        userService.add();
    }

}
