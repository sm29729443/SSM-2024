package com.atguigu.spring.ioc.bean;

import org.springframework.stereotype.Component;

@Component
public class Car {
    public Car() {
        System.out.println("Car 創建");
    }
}
