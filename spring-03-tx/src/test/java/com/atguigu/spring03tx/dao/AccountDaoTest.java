package com.atguigu.spring03tx.dao;

import com.atguigu.spring03tx.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
/**
* ClassName: AccountDaoTest
* Package: com.atguigu.spring03tx.dao
*/
@SpringBootTest
class AccountDaoTest {
    @Autowired
    private AccountDao accountDao;
    
    @Autowired
    private UserService userService;
    
    @Test
    public void testCheckOut(){
        userService.checkout("zhangsan", 2, 3);
    }
    
    @Test
    public void testUpdate(){
        accountDao.updateByUsername("zhangsan", new BigDecimal(9.99));
    }
}