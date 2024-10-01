package com.atguigu.spring03tx;
import java.math.BigDecimal;

import com.atguigu.spring03tx.bean.Book;
import com.atguigu.spring03tx.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Spring03TxApplicationTests {

	@Autowired
	private BookDao bookDao;
	
	@Test
	public void testDelete(){
	    bookDao.deleteBookById(1);
	}
	
	@Test
	public void testUpdate(){
	    bookDao.updateBookStockById(4, 2);
	}

	@Test
	public void testQuery(){
		Book bookById = bookDao.getBookById(1);
		System.out.println(bookById);
	}

	@Test
	public void testAdd(){
		Book book = new Book();
		book.setBookName("西遊記");
		book.setPrice(new BigDecimal("19.9"));
		book.setStock(100);

		bookDao.addBook(book);
	}

}
