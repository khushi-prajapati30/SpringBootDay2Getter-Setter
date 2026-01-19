package com.example.day2project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {

    @GetMapping("/about")
    public String about(){
        return "This is about page";
    }

}
