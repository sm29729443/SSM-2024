package com.atguigu.spring02aop.calculator.impl;

import com.atguigu.spring02aop.calculator.MathCalculator;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
* ClassName: MathCalculatorImpl
* Package: com.atguigu.spring02aop.calculator.impl
*/
@Component
public class MathCalculatorImpl implements MathCalculator {
    @Override
    public int add(int a, int b) {
        System.out.println("add");
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        System.out.println("subtract");
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        System.out.println("multiply");
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        System.out.println("divide");
        return a / b;
    }
}
