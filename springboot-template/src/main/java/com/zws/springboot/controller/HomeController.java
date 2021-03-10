package com.zws.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: weishi.zeng
 * @Date: 2021/3/10 11:13
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("/homePage")
public class HomeController {
    //http://localhost:9000/myboot/homepage/home
    @RequestMapping("/home")
    public String home() {
        log.error("请求进入...");
        return "hello world";
    }
}
