package com.example.springbootthree.controller;

import com.example.springbootthree.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class hello {
//    http://localhost:8080/hello?name=za
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(String name){
        return "你好啊,"+name;
    }

    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    public String hello2(String name,String id){
        System.out.printf(id);
        return "你好啊,"+name;
    }

    @RequestMapping(value = "/hello3",method = RequestMethod.GET)
    public String hello3(@RequestParam(value = "name") String name){
        return "GET";
    }


    @RequestMapping(value = "/post",method = RequestMethod.POST)
    public String postTest(){
        return "POST";
    }

    @RequestMapping(value = "/post2",method = RequestMethod.POST)
    public String postTest2(String name,String id){
        System.out.println(name);
        System.out.println(id);
        return "POST2";
    }

    @RequestMapping(value = "/post3",method = RequestMethod.POST)
    public String postTest3(User user){
        System.out.println(user);
        return "POST 请求user";
    }

    @GetMapping("/test/**")
    public  String test(){
        return "通配符";
    }
}
