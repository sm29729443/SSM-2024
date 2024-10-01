package com.atguigu.spring03tx.dao;

import com.atguigu.spring03tx.bean.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
* ClassName: AccountDao
* Package: com.atguigu.spring03tx.dao
*/
@Repository
public class AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 按照 username扣減用戶餘額
     */
    public void updateByUsername(String username, BigDecimal delta) {
        String sql = "update account set balance = balance - ? where username = ?";
        jdbcTemplate.update(sql, delta, username);
    }
}
