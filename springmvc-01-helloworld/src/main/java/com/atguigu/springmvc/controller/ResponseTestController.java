package com.atguigu.springmvc.controller;
import com.atguigu.springmvc.bean.Address;

import com.atguigu.springmvc.bean.Person;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
* ClassName: ResponseTestController
* Package: com.atguigu.springmvc.controller
*/
@RestController
public class ResponseTestController {

    @RequestMapping("/resp01")
    public Person resp01() {
        Person person = new Person();
        person.setUsername("張三");
        person.setPassword("123");
        person.setCellphone("111");
        person.setAgreement(false);
        person.setAddress(new Address("省", "市", "區"));
        person.setSex("女");
        person.setHobby(new String[]{"籃球", "足球"});
        person.setGrade("二年級");

        return person;
    }

    @RequestMapping("/download")
    public ResponseEntity<InputStreamResource> download(InputStream inputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\sm297\\OneDrive\\圖片\\anime.png");
        // 1. 解決 filename 中文亂碼
        String encode = URLEncoder.encode("中文測試", StandardCharsets.UTF_8);
        // 2. 解決 OOM (Memory 溢出)
        InputStreamResource inputStreamResource = new InputStreamResource(fileInputStream);
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .contentLength(inputStream.available())
                .header("Content-Disposition", "attachment; filename=" + encode)
                .body(inputStreamResource);
    }
}
