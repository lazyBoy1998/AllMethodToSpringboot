package com.example.springbootfour.controller;

import com.example.springbootfour.dto.LoginDTO;
import com.example.springbootfour.service.impl.UserServiceImpl;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("auth")
public class LoginController {
    @Autowired(required = false)
    UserServiceImpl userService;

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    @PostMapping("/login")
    public String login(String username, String password
            , HttpSession session
            , RedirectAttributes attributes ) {
        LoginDTO loginDTO = userService.login(username, password);
        String error = loginDTO.getError();
        if (error == null) { // 成功

            session.setAttribute("account", loginDTO.getUser());
        } else { // 失败
            attributes.addFlashAttribute("error", error);
        }
        return  loginDTO.getPath();
    }

    /**
     * 登出
     */
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }


}
