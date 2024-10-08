package com.atguigu.springmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
* ClassName: RequestMappingLimitController
* Package: com.atguigu.springmvc.controller
*/
@RestController
public class RequestMappingLimitController {

    @ResponseBody
    @RequestMapping(value = "/test01", method = RequestMethod.POST)
    public String test01() {
        return "hello";
    }

    /*
    * 請求參數中必須帶有 username 參數
    * 請求參數中必須帶有 age 參數，且 value 要等於 18
    * */
    @ResponseBody
    @RequestMapping(value = "/test02", params = {"username", "age=18"})
    public String test02() {
        return "hello";
    }

    /*
    * headers 必須攜帶 haha
    * */
    @ResponseBody
    @RequestMapping(value = "/test03", headers = "haha")
    public String test03() {
        return "hello";
    }

    /*
    *   限定 RequestBody 只能是 application/json
    * */
    @ResponseBody
    @RequestMapping(value = "/test04", consumes = "application/json")
    public String test04() {
        return "hello";
    }

    /*
     *   限定 ResponseBody 是 text/html;charset=utf-8
     * */
    @ResponseBody
    @RequestMapping(value = "/test05", produces = "text/html;charset=utf-8")
    public String test05() {
        return "<h1>你好挖</h1>";
    }
}
