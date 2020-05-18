package com.chp.mybatis.service;

import com.chp.mybatis.pojo.Student;

public interface StudentService {
    int add(Student student);
    int update(Student student);
    int deleteBysno(String sno);
    Student queryStudentBySno(String sno);
}
