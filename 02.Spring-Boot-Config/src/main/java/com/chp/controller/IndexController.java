package com.chp.controller;

import com.chp.config.Person1;
import com.chp.config.Person2;
import com.chp.config.Person3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private Person1 person1;

    @Autowired
    private Person2 person2;

    @Autowired
    private Person3 person3;

    @GetMapping("/person1")
    public Person1 person1(){
        return person1;
    }

    @GetMapping("/person2")
    public Person2 getPerson2() {
        return person2;
    }

    @GetMapping("/person3")
    public Person3 getPerson3() {
        return person3;
    }
}
