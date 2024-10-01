package com.atguigu.spring03tx.rowmapper;
import java.math.BigDecimal;

import com.atguigu.spring03tx.bean.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
* ClassName: BookMapper
* Package: com.atguigu.spring03tx.rowmapper
*/public class BookMapper implements RowMapper<Book> {
    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        Book book = new Book();
        book.setId(rs.getInt("id"));
        book.setBookName(rs.getString("bookName"));
        book.setPrice(rs.getBigDecimal("price"));
        book.setStock(rs.getInt("stock"));
        return book;

    }
}
