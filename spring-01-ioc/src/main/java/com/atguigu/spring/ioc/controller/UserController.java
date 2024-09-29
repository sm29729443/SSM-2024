package com.atguigu.spring.ioc.controller;

import com.atguigu.spring.ioc.bean.Person;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

/**
* ClassName: UserController
* Package: com.atguigu.spring.ioc.controller
*/
@ToString
@Data
@Controller
public class UserController {

    @Autowired
    private Person lisi;

    @Autowired
    private List<Person> personList;

    @Autowired
    private Map<String, Person> personMap;

    @Autowired
    ApplicationContext applicationContext;

}
