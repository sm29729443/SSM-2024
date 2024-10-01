package com.atguigu.spring03tx.dao;

import com.atguigu.spring03tx.bean.Book;
import com.atguigu.spring03tx.rowmapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
* ClassName: BookDao
* Package: com.atguigu.spring03tx.dao
*/
@Repository
public class BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Book getBookById(Integer id){
        String sql = "select * from book where id = ?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Book.class), id);
        return book;
    }

    public void addBook(Book book){
        String sql = "insert into book(bookName, price, stock) values(?, ?, ?)";
        jdbcTemplate.update(sql, book.getBookName(), book.getPrice(), book.getStock());
    }

    public void updateBookStockById(Integer id, Integer stock){
        String sql = "update book set stock = stock - ? where id = ?";
        jdbcTemplate.update(sql, stock, id);
    }

    public void deleteBookById(Integer id){
        String sql = "delete from book where id = ?";
        jdbcTemplate.update(sql, id);
    }


}
