package com.test.spring6.iocxml.ditest;

//部门类
public class Dept {
    private String dname;

    public String getDname() {return dname; }
    public void setDname(String dname) { this.dname = dname; }

    public void info(){
        System.out.println("部门名称:" + dname);
    }
}
