package com.example.studentmanagement.controller;

import com.example.studentmanagement.entity.User;
import com.example.studentmanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/home")
    public String home(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();

        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new IllegalArgumentException("用户未找到：" + username));

        // 检查用户角色（假设之前有类似 Role.STUDENT 的代码）
        if (user.getRole() != null && "学生".equals(user.getRole().getRoleName())) {
            // 如果是学生角色，执行特定逻辑（例如显示特定页面）
            model.addAttribute("isStudent", true);
        } else {
            model.addAttribute("isStudent", false);
        }

        model.addAttribute("user", user);
        return "home";
    }
}
