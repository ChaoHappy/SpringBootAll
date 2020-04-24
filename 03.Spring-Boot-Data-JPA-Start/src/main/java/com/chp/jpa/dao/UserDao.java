package com.chp.jpa.dao;

import com.chp.jpa.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Long> {

    @Override
    User  save(User s);
}
