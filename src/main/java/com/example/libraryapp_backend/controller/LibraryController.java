package com.example.libraryapp_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LibraryController {

    @PostMapping("/")
    public String Admin(){
        return "Welcome to admin login";
    }

    @PostMapping("/register")
    public String User_registration(){
        return "Welcome to user registration page";
    }
    @PostMapping("/ulogin")
    public String User_login(){
        return "Welcome to User login page";
    }
}
