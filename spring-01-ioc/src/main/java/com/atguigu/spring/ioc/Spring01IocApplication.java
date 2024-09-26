package com.atguigu.spring.ioc;

import com.atguigu.spring.ioc.bean.Car;
import com.atguigu.spring.ioc.bean.Dog;
import com.atguigu.spring.ioc.bean.Person;
import com.atguigu.spring.ioc.controller.UserController;
import com.atguigu.spring.ioc.factory.BYDFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.sql.SQLOutput;
import java.util.Map;

@SpringBootApplication
public class Spring01IocApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Spring01IocApplication.class, args);
        System.out.println("--------------IOC 容器創建完成-----------");
        Dog dog = ioc.getBean(Dog.class);
        System.out.println("Dog: " + dog);
        String dogName = ioc.getEnvironment().getProperty("dog.name");
        String dogAge = ioc.getEnvironment().getProperty("dog.age");
        System.out.println("Dog Name: " + dogName);
        System.out.println("Dog Age: " + dogAge);
    }
}
