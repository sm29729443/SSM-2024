package com.atguigu.spring03tx.service;

import com.atguigu.spring03tx.dao.AccountDao;
import com.atguigu.spring03tx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* ClassName: UserService
* Package: com.atguigu.spring03tx.service
*/

public interface UserService {


    void checkout(String username, Integer bookId, Integer buyNumber);
}
