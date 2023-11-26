package com.test.spring6.iocxml.dimap;

import com.test.spring6.iocxml.dimap.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStu {
    @Test
    public void testStu(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("bean-diref" +
                ".xml");
        Student student = context.getBean("studentp", Student.class);
         student.run();
    }
}
