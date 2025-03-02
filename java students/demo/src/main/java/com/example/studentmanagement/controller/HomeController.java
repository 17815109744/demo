package com.example.studentmanagement.controller;

import com.example.studentmanagement.entity.Role;
import com.example.studentmanagement.entity.User;
import com.example.studentmanagement.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private RoleRepository roleRepository;

    @GetMapping("/home")
    public String home(Model model) {
        User user = new User();
        user.setUsername("张三");

        // 使用枚举常量设置角色
        user.setRole(Role.STUDENT);

        model.addAttribute("user", user);
        return "home";
    }
}