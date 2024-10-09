package com.atguigu.springmvc.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
* ClassName: MyInterceptor1
* Package: com.atguigu.springmvc.interceptor
*/
@Component
public class MyInterceptor1 implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("preHandle MyInterceptor1" + request.getRequestURI() + "當前線程:" + Thread.currentThread().getName());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle MyInterceptor1" + request.getRequestURI() + "當前線程:" + Thread.currentThread().getName());
        int i = 10 / 0;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    System.out.println("afterCompletion MyInterceptor1" + request.getRequestURI() + "當前線程:" + Thread.currentThread().getName());
    }
}
