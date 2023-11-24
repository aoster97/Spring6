package com.test.spring6.iocxml.ditest;

import java.util.Arrays;

//员工类
public class Emp {

    //员工属于某一个部门
    //对象类型的属性
    private Dept dept;
    //员工名称
    private String ename;
    //员工年龄
    private Integer age;
    //员工爱好
    private String[] loves;

    public Dept getDept() {return dept; }
    public void setDept(Dept dept) { this.dept = dept; }
    public String getEname() { return ename; }
    public void setEname(String ename) { this.ename = ename; }
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
    public String[] getLoves() {return loves; }
    public void setLoves(String[] loves) { this.loves = loves; }

    public void work() {
        System.out.println(ename + "emp work....." + age);
        dept.info();
        System.out.println(Arrays.toString(loves));
    }
}
