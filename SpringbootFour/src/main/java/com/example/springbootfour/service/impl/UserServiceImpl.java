package com.example.springbootfour.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbootfour.dto.LoginDTO;
import com.example.springbootfour.mapper.UserMapper;
import com.example.springbootfour.pojo.User;
import com.example.springbootfour.service.UserService;
import cn.hutool.crypto.digest.MD5;
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

    @Override
    public LoginDTO login(String username, String password) {
        LoginDTO loginDTO = new LoginDTO();
        String path = "redirect:/";
        String error = null;

        User user = lambdaQuery().eq(User::getUsername, username).one();

        if(user == null){
            loginDTO.setError("用户名不存在");
        }
        //数据库中的密码加密了，需对传入的密码加密再与数据库中的密码比对
        MD5 md5 = new MD5(user.getSalt().getBytes());
        String digestHex = md5.digestHex(password);
        if(digestHex.equals(user.getPassword())){
            loginDTO.setPath("login/main");
        }
        else{
            loginDTO.setError("密码错误");
        }
        loginDTO.setUser(user);
        return loginDTO;
    }
}
