package com.atguigu.spring.ioc.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
* ClassName: Dog
* Package: com.atguigu.spring.ioc.bean
*/
@PropertySource("classpath:dog.properties")
@Data
@Component
public class Dog {
    @Value("${dog.name}")
    private String name;
    @Value("${dog.age}")
    private int age;

    public Dog() {
        System.out.println("Dog created");
    }
}
