package com.atguigu.spring03tx.service.impl;

import com.atguigu.spring03tx.bean.Book;
import com.atguigu.spring03tx.dao.AccountDao;
import com.atguigu.spring03tx.dao.BookDao;
import com.atguigu.spring03tx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
* ClassName: UserServiceImpl
* Package: com.atguigu.spring03tx.service.impl
*/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private BookDao bookDao;
    @Autowired
    private AccountDao accountDao;

    @Transactional
    @Override
    public void checkout(String username, Integer bookId, Integer buyNumber) {
    // 1. 查詢書本訊息
        Book book = bookDao.getBookById(bookId);
    // 2. 計算買書的總價格
        BigDecimal price = book.getPrice();
        BigDecimal total = new BigDecimal(buyNumber).multiply(price);
    // 3. 扣減餘額
        accountDao.updateByUsername(username, total);
    // 4. 扣減庫存
        bookDao.updateBookStockById(bookId, buyNumber);
    }
}
