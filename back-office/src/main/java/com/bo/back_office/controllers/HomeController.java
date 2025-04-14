package com.bo.back_office.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String index(Model model) {
        model.addAttribute("pageTitle", "首頁");
        return "index";
    }
}
