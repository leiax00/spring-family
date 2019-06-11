package com.leiax00.spring.springfamily;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringFamilyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringFamilyApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hell Spring!!";
    }
}
