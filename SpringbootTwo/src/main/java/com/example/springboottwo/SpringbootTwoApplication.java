package com.example.springboottwo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootTwoApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringbootTwoApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
//        SpringApplication.run(SpringbootTwoApplication.class, args);
    }

}
