package com.example.spring_boot_10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class maincontroller_10 {
    @GetMapping("/")
    public String model(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }


}

