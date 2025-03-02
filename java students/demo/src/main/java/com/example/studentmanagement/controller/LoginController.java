package com.example.studentmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    // 暂时注释掉，因为 Spring Security 会处理登录
    /*
    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        if ("admin".equals(username) && "password".equals(password)) {
            return "redirect:/home";
        } else {
            model.addAttribute("error", "用户名或密码错误");
            return "login";
        }
    }
    */

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/login?logout";
    }
}