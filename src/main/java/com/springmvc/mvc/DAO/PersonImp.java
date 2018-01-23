package com.springmvc.mvc.DAO;

import org.springframework.stereotype.Repository;

/**
 * Created by lixy3 on 18-1-23.
 */
@Repository
public class PersonImp implements Person {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
