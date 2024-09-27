package com.atguigu.spring.ioc;

import com.atguigu.spring.ioc.bean.Car;
import com.atguigu.spring.ioc.bean.Dog;
import com.atguigu.spring.ioc.bean.Person;
import com.atguigu.spring.ioc.bean.UserUUIDTest;
import com.atguigu.spring.ioc.controller.UserController;
import com.atguigu.spring.ioc.dao.UserDao;
import com.atguigu.spring.ioc.factory.BYDFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Map;

@SpringBootApplication
public class Spring01IocApplication {

    public static void main(String[] args) throws FileNotFoundException {
        ConfigurableApplicationContext ioc = SpringApplication.run(Spring01IocApplication.class, args);
        System.out.println("--------------IOC 容器創建完成-----------");
        UserUUIDTest bean = ioc.getBean(UserUUIDTest.class);
        System.out.println("bean = " + bean);
    }
}
