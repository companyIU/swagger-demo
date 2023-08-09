package com.example.swaggerdemo.controller;

import com.example.swaggerdemo.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weibing
 * @create 2023-07-11 18:41
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/1")
    public String test1() {
        return "ok";
    }
    @GetMapping("/user")
    public User getUser() {
        return new User();
    }
}
