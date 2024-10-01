package com.atguigu.spring03tx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class Spring03TxApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring03TxApplication.class, args);
	}

}
