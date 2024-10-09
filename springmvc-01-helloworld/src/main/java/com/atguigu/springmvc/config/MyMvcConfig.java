package com.atguigu.springmvc.config;

import com.atguigu.springmvc.interceptor.MyInterceptor0;
import com.atguigu.springmvc.interceptor.MyInterceptor1;
import com.atguigu.springmvc.interceptor.MyInterceptor2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/** ClassName: MyMvcConfig Package: com.atguigu.springmvc.config */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Autowired
    MyInterceptor0 myInterceptor0;
    @Autowired
    MyInterceptor1 myInterceptor1;
    @Autowired
    MyInterceptor2 myInterceptor2;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor0).addPathPatterns("/**");
        registry.addInterceptor(myInterceptor1).addPathPatterns("/**");
        registry.addInterceptor(myInterceptor2).addPathPatterns("/**");
    }
}
