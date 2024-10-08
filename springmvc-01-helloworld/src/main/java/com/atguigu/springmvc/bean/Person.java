package com.atguigu.springmvc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
* ClassName: Person
* Package: com.atguigu.springmvc.bean
*/
@Data
@ToString
public class Person {
    private String username;
    private String password;
    private String cellphone;
    private boolean agreement;
    private Address address;
    private String sex;
    private String[] hobby;
    private String grade;
}
