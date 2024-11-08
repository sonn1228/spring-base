package com.sonnguyen.base_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Chào mừng đến với trang chủ!");
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/home")
    public String home(Model model) {
        return "home";
    }

    @GetMapping("/signup")
    public String signup(Model model) {
        return "signup";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        return "dashboard";
    }

    @GetMapping("/transfer")
    public String transfer(Model model) {
        return "transfer";
    }

    @GetMapping("/createBank")
    public String createBank(Model model) {
        return "createbank";
    }

    @GetMapping("/trahistory")
    public String trahistory(Model model) {
        return "transactionhistory";
    }

}
