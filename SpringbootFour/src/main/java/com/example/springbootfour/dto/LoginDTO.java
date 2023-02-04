package com.example.springbootfour.dto;

import com.example.springbootfour.pojo.User;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
@Data
@ToString
@Accessors(chain = true)
public class LoginDTO {
    /**
     * 错误信息
     */
    private String error;

    /**
     * 重定向或跳转路径
     */
    private String path;

    /**
     * 登陆用户信息
     */
    private User user;
}
