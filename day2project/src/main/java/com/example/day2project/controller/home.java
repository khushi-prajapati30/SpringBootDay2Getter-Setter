package com.example.day2project.controller;

import com.example.day2project.models.studentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {

    @GetMapping("/")
    public studentModel getStudent(){
        studentModel student = new studentModel(1, "Khushi Prajapati", "khushikprajapati9053@gmail.com");
        //we can also do it using set
        return student;
    }


}
