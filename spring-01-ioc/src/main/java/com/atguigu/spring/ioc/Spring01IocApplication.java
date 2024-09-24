package com.atguigu.spring.ioc;

import com.atguigu.spring.ioc.bean.Car;
import com.atguigu.spring.ioc.bean.Person;
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
        Map<String, Person> beansOfType = ioc.getBeansOfType(Person.class);
        System.out.println("bean: " + beansOfType);
        ConfigurableEnvironment environment = ioc.getEnvironment();
        String os = environment.getProperty("OS");
        System.out.println("os:" + os);
    }

}
