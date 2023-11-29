package com.test.spring6.iocxml.life;

public class User {

    private String name;

    public User() {
        System.out.println("1. bean对象创建(调用无参数构造)");
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name;
        System.out.println("2、给bean对象设置相关属性");
    }

    // 初始化的方法
    public void initMethod(){
        System.out.println("4. bean对象初始化（调用指定初始化方法）");
    }

    // 销毁的方法
    public void destroyMethod(){
        System.out.println("7、bean对象销毁(配置指定销毁的方法)");
    }

}
