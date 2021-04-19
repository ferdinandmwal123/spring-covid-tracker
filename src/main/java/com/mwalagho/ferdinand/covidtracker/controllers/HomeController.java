package com.mwalagho.ferdinand.covidtracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//renders html ui
@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }
}
