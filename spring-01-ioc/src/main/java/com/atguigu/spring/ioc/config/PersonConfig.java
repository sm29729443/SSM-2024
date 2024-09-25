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

    @Bean("bill")
    public Person bill() {
        Person person = new Person();
        person.setName("比爾蓋茲");
        person.setAge(87);
        return person;
    }

    @Bean("lisi")
    public Person lisi() {
        Person person = new Person();
        person.setName("李四");
        person.setAge(23);
        return person;
    }

    @Bean("peter")
    public Person peter() {
        Person person = new Person();
        person.setName("彼得");
        person.setAge(22);
        return person;
    }
}
