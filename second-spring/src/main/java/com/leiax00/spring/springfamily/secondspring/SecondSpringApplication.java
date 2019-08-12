package com.leiax00.spring.springfamily.secondspring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SecondSpringApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SecondSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Second spring app is starting....");
    }
}