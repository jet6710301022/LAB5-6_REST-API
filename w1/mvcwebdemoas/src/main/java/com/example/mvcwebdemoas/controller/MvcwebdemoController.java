package com.example.mvcwebdemoas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MvcwebdemoController {
    @GetMapping("/")
    public String home() { return "index"; }

    @GetMapping("/registration")
    public String registration() { return "registration"; }

    @GetMapping("/contactus")
    public String contactUs() { return "contactus"; }
}