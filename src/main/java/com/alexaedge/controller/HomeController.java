package com.alexaedge.controller;

import com.alexaedge.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    private PropertyService service;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("properties", service.getAllProperties());
        return "home";
    }
}
