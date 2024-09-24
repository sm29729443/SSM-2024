package com.atguigu.spring.ioc.config;

import com.atguigu.spring.ioc.bean.Person;
import com.atguigu.spring.ioc.condition.MacCondition;
import com.atguigu.spring.ioc.condition.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
* ClassName: PersonConfig
* Package: com.atguigu.spring.ioc.config
*/
@Configuration
public class PersonConfig {

    @Conditional(WindowsCondition.class)
    @Bean("person windows")
    public Person personOne(){
        return new Person("Person win", 20);
    }

    @Conditional(MacCondition.class)
    @Bean("person mac")
    public Person personTwo(){
        return new Person("Person mac", 21);
    }
}
