package com.atguigu.spring.ioc;

import com.atguigu.spring.ioc.bean.Car;
import com.atguigu.spring.ioc.factory.BYDFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Map;

@SpringBootApplication
public class Spring01IocApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Spring01IocApplication.class, args);
        System.out.println("--------------IOC 容器創建完成-----------");
        Car bean = ioc.getBean(Car.class);
        System.out.println("car:" + bean);
        Map<String, Car> beansOfType = ioc.getBeansOfType(Car.class);
        System.out.println("beansOfType:" + beansOfType);
        Map<String, BYDFactory> beansOfType1 = ioc.getBeansOfType(BYDFactory.class);
        System.out.println("beansOfType1:" + beansOfType1);
    }

}
