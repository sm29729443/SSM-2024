package com.atguigu.spring.ioc.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Data;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
* ClassName: User
* Package: com.atguigu.spring.ioc.bean
*/
@Data
public class User implements InitializingBean, DisposableBean {
    private String name;
    private int age;
    private Car car;
    @Autowired
    private Dog dog;
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

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet active");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy method active");
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("postConstruct active");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("preDestroy active");
    }
}
