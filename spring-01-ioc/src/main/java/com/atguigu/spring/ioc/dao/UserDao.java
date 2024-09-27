package com.atguigu.spring.ioc.dao;

import com.atguigu.spring.ioc.datasource.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
* ClassName: UserDao
* Package: com.atguigu.spring.ioc.dao
*/
@Repository
public class UserDao {
    @Autowired
    private MyDataSource dataSource;

    public void showDataSource() {
        System.out.println("dataSource:" + dataSource);
    }
}
