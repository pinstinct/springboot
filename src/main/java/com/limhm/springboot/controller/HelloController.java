package com.limhm.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    /* Building an Application with Spring Boot
    * https://spring.io/guides/gs/spring-boot/
    * */

    @RequestMapping("/")
    public String index(){
        return "Greetings from Spring Boot!";
    }
}
