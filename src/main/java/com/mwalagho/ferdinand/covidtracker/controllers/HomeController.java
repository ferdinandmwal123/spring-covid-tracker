package com.mwalagho.ferdinand.covidtracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//renders html ui
@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("testName","TEST");
        return "home";
    }
}
