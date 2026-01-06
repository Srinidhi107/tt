package com.example.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.dto.SignupRequest;

@RestController
@RequestMapping("/api")
public class AuthController {
    @PostMapping("/signup")
    public String m(@RequestBody SignupRequest sd){
        System.out.println("\n\t data : "+sd);
        return "data"+sd.toString();
    }



}
