package com.poly.controller;

import com.poly.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @PostMapping("login")
    public ModelAndView layout(Model model, @RequestParam("userName") String username,
                              @RequestParam("passWord") String password){
        User user = new User(username, password);
        model.addAttribute("message", "Dang nhap thanh cong");
        ModelAndView modelAndView = new ModelAndView("layout", "user", user);
        return modelAndView;
    }

}

