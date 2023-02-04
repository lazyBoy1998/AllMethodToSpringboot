package com.example.springbootfour.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springbootfour.dto.LoginDTO;
import com.example.springbootfour.pojo.User;

public interface UserService extends IService<User> {
    LoginDTO login(String username, String password);
}
