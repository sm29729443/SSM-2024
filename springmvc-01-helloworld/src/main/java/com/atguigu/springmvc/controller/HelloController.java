package com.atguigu.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* ClassName: HelloController
* Package: com.atguigu.springmvc.controller
*/
@Controller //跟 @Service、@Repository 一樣都是給人看得，實際上功能就是 @Component
public class HelloController {

    @ResponseBody // Spring MVC 默認 return 的是跳到一個頁面，要使用 @ResponseBody 才會將 return value 放到一個響應體中返回純數據
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
