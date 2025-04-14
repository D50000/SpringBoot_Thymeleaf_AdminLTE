package com.bo.back_office.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index"; // 對應 resources/templates/index.html
    }
}
