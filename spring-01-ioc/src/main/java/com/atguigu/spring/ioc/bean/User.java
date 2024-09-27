package com.atguigu.spring.ioc.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**
* ClassName: User
* Package: com.atguigu.spring.ioc.bean
*/
@Data
public class User {
    private String name;
    private int age;
    private Car car;

    @Autowired
    public void setCar(Car car) {
        System.out.println("@Autowired 注入");
        this.car = car;
    }

    public User() {
        System.out.println("User created");
    }
    public void initUser(){
        System.out.println("initUser active");
    }
    public void destroyUser(){
        System.out.println("destroyUser active");
    }
}
