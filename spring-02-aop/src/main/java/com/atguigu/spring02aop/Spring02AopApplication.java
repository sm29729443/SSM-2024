package com.atguigu.spring02aop;

import com.atguigu.spring02aop.aspect.LogAspect;
import com.atguigu.spring02aop.calculator.MathCalculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring02AopApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ioc = SpringApplication.run(Spring02AopApplication.class, args);

	}

}
