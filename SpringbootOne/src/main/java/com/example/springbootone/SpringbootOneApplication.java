package com.example.springbootone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootOneApplication {
    @RequestMapping("/")
    String index(){
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootOneApplication.class, args);
    }

}
