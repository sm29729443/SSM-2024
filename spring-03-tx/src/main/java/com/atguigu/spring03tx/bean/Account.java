package com.atguigu.spring03tx.bean;

import lombok.Data;

import java.math.BigDecimal;

/**
* ClassName: Account
* Package: com.atguigu.spring03tx.bean
*/
@Data
public class Account {
    private Integer id;
    private String username;
    private Integer age;
    private BigDecimal balance;
}
