package com.infnet.basespringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {

    @GetMapping("/")
    public String viewHomePage() {
        return "index";
    }

    @GetMapping("/login")
    public String loginPage() { return "login";}


}
