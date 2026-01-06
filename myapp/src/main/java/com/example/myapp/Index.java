package com.example.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.dto.M;
@RestController
public class Index {
    @GetMapping("/")
    M m() {
        return new M();
    }
}
