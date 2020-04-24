package com.chp.jpa.dao;

import com.chp.SpringBootDataJpaStartApplication;
import com.chp.jpa.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootDataJpaStartApplication.class)
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void saveUserTest(){
        User user = new User();
        user.setName("张四");
        userDao.save(user);
        List<User> users = userDao.findAll();
        System.out.println("users："+users);
    }
}
