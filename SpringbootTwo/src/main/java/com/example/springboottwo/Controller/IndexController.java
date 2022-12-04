package com.example.springboottwo.Controller;

import com.example.springboottwo.Bean.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private Blog blog;

    @RequestMapping("/")
    public String index2() {
        return blog.getName()+"——"+ blog.getTitle();
    }
}

