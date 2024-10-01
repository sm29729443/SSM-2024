package com.atguigu.spring03tx.bean;

import lombok.Data;

import java.math.BigDecimal;

/**
* ClassName: Book
* Package: com.atguigu.spring03tx.bean
*/
@Data
public class Book {
    private Integer id;
    private String bookName;
    private BigDecimal price;
    private Integer stock;
}
