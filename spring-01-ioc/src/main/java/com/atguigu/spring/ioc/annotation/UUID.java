package com.atguigu.spring.ioc.annotation;

import java.lang.annotation.*;

/**
* ClassName: UUID
* Package: com.atguigu.spring.ioc.annotation
*/
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface UUID {
}
