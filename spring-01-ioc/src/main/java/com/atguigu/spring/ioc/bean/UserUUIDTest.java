package com.atguigu.spring.ioc.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
* ClassName: UserUUIDTest
* Package: com.atguigu.spring.ioc.bean
*/
@Data
@Component
@ToString
public class UserUUIDTest {
    @com.atguigu.spring.ioc.annotation.UUID
    private String uuid;

    public UserUUIDTest() {
        System.out.println("UserUUIDTest created");
    }
}
