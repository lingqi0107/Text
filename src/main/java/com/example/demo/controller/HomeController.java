package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lingqi
 * @time 2021/6/26 15:59
 * @since JDK 1.8
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hello, World!";
    }
}
