package com.atguigu.spring02aop.aspect;

import lombok.Data;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
* ClassName: LogAspect
* Package: com.atguigu.spring02aop.aspect
*/
@Data
@Component
@Aspect  // 告訴 Spring 這個 Component 是切面
public class LogAspect {

    /*
     * 告訴 Spring 以下通知方法於何時何地執行
     * 何時?
     *  @Before : 方法執行之前運行
     *  @AfterReturning : 方法執行正常返回結果運行
     *  @AfterThrowing : 方法拋出異常運行
     *  @After : 方法執行之後運行
     * 何地?
     *  要用切入點表達式:execution(方法的全簽名)
     * */
    @Before("execution(int *(int, int))")
    public void logStart(){
        System.out.println("【切面-日誌】 logStart");
    }
    @After("execution(int *(int, int))")
    public void logEnd(){
        System.out.println("【切面-日誌】 logEnd");
    }
    @AfterThrowing("execution(int *(int, int))")
    public void logException(){
        System.out.println("【切面-日誌】 logException");
    }
    @AfterReturning("execution(int *(int, int))")
    public void logReturn(){
        System.out.println("【切面-日誌】 logReturn");
    }
}
