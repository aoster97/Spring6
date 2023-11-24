package com.test.spring6.iocxml.dimap;

public class Teacher {
    private String teacherid;
    private String teachername;

    public String getTeacherid() { return teacherid; }
    public void setTeacherid(String teacherid) { this.teacherid = teacherid; }
    public String getTeachername() { return teachername; }
    public void setTeachername(String teachername) { this.teachername = teachername; }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherid='" + teacherid + '\'' +
                ", teachername='" + teachername + '\'' +
                '}';
    }
}
