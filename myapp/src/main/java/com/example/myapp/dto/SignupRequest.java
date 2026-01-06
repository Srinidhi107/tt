package com.example.myapp.dto;

import lombok.Data;

@Data
public class SignupRequest {
    public String name;
    public String email;
    public String password;
}
