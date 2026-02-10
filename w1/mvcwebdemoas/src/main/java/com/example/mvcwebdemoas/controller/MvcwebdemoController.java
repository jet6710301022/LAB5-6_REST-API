package com.example.mvcwebdemoas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.mvcwebdemoas.model.RegistrationForm;
import jakarta.validation.Valid;

@Controller
public class MvcwebdemoController {

    // --- ส่วนของ Lab 5 (เดิม) ---
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/contactus")
    public String contactUs() {
        return "contactus";
    }

    // --- ส่วนของ Lab 6 (ใหม่: ระบบลงทะเบียน) ---
    @GetMapping("/registration")
    public String showRegistrationForm(Model model) {
        model.addAttribute("registrationForm", new RegistrationForm());
        return "registration";
    }

    @PostMapping("/register")
    public String handleRegistration(@Valid RegistrationForm registrationForm, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "registration";
        }
        
        model.addAttribute("firstName", registrationForm.getFirstName());
        model.addAttribute("lastName", registrationForm.getLastName());
        model.addAttribute("country", registrationForm.getCountry());
        model.addAttribute("dob", registrationForm.getDob());
        model.addAttribute("email", registrationForm.getEmail());
        
        return "success";
    }
}