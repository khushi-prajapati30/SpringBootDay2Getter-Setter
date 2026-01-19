package com.example.day2project.controller;

import com.example.day2project.models.studentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class home {

//    @GetMapping("/")
//    public studentModel getStudent(){
//        studentModel student = new studentModel(1, "Khushi Prajapati", "khushikprajapati9053@gmail.com");
//        //we can also do it using set
//        return student;
//    }

    @GetMapping("/")
    public ArrayList<studentModel> display(){
        ArrayList<studentModel> ans = new ArrayList<>();
        ans.add(new studentModel(2, "Prashant", "prashantMishra09@gmail.com"));
        ans.add(new studentModel(3, "Harsh", "harshrai@gmail.com" ));
        ans.add(new studentModel(4, "Deeksha", "deeksha67@gmail.com"));
        ans.add(new studentModel(5, "Akriti", "akriti7@gmail.com"));
        ans.add(new studentModel(6, "Nancy", "nancy07@gmail.com"));

        return ans;
    }



}
