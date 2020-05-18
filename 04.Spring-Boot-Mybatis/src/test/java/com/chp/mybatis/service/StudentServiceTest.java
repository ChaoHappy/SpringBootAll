package com.chp.mybatis.service;

import com.chp.SpringBootMybatisStartApplication;
import com.chp.mybatis.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootMybatisStartApplication.class)
public class StudentServiceTest {

    @Autowired
    private StudentService s;

    @Test
    public  void queryStudentBySno(){
        Student student = s.queryStudentBySno("001");
        System.out.println(student);
    }
}
