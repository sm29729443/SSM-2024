package com.atguigu.springmvc.controller;

import com.atguigu.springmvc.bean.Person;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
* ClassName: RequestTestController
* Package: com.atguigu.springmvc.controller
*/
@RestController
public class RequestTestController {

    /* Request Param: username=zhangsan&password=1234&cellphone=123&agreement=on
       要求: 方法變量名要和Request Param名一樣
    * */
    @RequestMapping("/handle01")
    public String handle01(String username,
                           String password,
                           String cellphone,
                           boolean agreement) {
        System.out.println(username);
        System.out.println(password);
        System.out.println(cellphone);
        System.out.println(agreement);
        return "success";
    }

    /*
    * 使用 POJO 拿到 Req Param
    * */
    @RequestMapping("/handle03")
    public String handle03(Person person) {
        System.out.println(person);
        return "success";
    }

    @RequestMapping("/handle04")
    public String handle04(@RequestHeader("host") String host) {
        System.out.println(host);
        return "success";
    }

    /* 使用 POJO 處理以下 URL
      URL:
    * http://localhost:8080/handle06?username=zhangsan&password=1234&cellphone=123
    * &address.province=%E7%9C%81
    * &address.city=%E5%B8%82
    * &address.area=%E5%8D%80
    * &sex=%E7%94%B7
    * &hobby=%E8%B6%B3%E7%90%83
    * &hobby=%E7%AF%AE%E7%90%83
    * &grade=%E4%B8%80%E5%B9%B4%E7%BA%A7
    * &agreement=on
    * */
    @RequestMapping("/handle06")
    public String handle06(Person person) {
        System.out.println(person);
        return "success";
    }

    @RequestMapping("/handle07")
    public String handle07(@RequestBody Person person) {
        System.out.println(person);
        return "success";
    }

    /*
        MultipartFile: Spring MVC 提供用來封裝文件上傳的物件
     */
    @RequestMapping("/handle08")
    public String handle08(Person person,
                           @RequestParam("headerImg") MultipartFile headerImg,
                           @RequestParam("lifeImg") MultipartFile[] lifeImgs) {
        String originalFilename = headerImg.getOriginalFilename();
        System.out.println("originalFilename" + originalFilename);
        Arrays.stream(lifeImgs).forEach(lifeImg -> {
            System.out.println("lifeImg: " + lifeImg.getOriginalFilename());
        });
        System.out.println(person);
        return "success";
    }

    /*
    * HttpEntity:封裝整個 Request 成一個 HttpEntity 物件
    * 泛型:指的是 RequestBody 的數據類型，如果寫 Person，Spring MVC 就會嘗試將 Body 裡的數據轉換成 Person 物件
    * */
    @RequestMapping("/handle09")
    public String handle09(HttpEntity<Person> httpEntity) {
        Person body = httpEntity.getBody();
        return "success";
    }

}
