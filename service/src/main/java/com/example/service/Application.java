package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

    private static Logger log = LoggerFactory.getLogger(Application.class);

    @RequestMapping(value = "/service")
    public String service() {
        log.info("Access service");
        return "Access service";
    }

    @RequestMapping(value = "/")
    public String sayHello() {
        log.info("Access /");
        return "Hi!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
