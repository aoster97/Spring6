package com.test.spring6.iocxml.dimap;
import java.util.List;
import java.util.Map;

//学生类,一个学生,对应着多个老师
public class Student {
    private String sname;
    private String sid;
    private Map<String,Teacher>  teacherMap;
    private List<Lesson> lessonList;

    public Map<String, Teacher> getTeacherMap() {return teacherMap; }
    public void setTeacherMap(Map<String, Teacher> teacherMap) { this.teacherMap = teacherMap; }

    public List<Lesson> getLessonList() { return lessonList; }
    public void setLessonList(List<Lesson> lessonList) { this.lessonList = lessonList; }

    public String getSname() { return sname; }
    public void setSname(String sname) { this.sname = sname; }
    public String getSid() { return sid; }
    public void setSid(String sid) { this.sid = sid; }

    public void run(){
        System.out.println("学生编号:  " + sid + "  学生名称:  " + sname );
        System.out.println(teacherMap);
        System.out.println(lessonList);
    }
}
