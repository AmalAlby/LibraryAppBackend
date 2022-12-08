package com.example.libraryapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
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



    @PostMapping(path="/entry")
    public String Books_entry(){
        return "Welcome to books entry page";
    }
    @GetMapping("/view")
    public String Books_view(){
        return "Welcome to books view page";
    }
    @PostMapping("/search")
    public String Books_search(){
        return "Welcome to books search page";
    }
    @PostMapping("/delete")
    public String Books_delete(){
        return "Welcome to books delete page";
    }
    @PostMapping("/edit")
    public String Books_edit(){
        return "Welcome to books edit page";
    }
    @PostMapping("/issue")
    public String Issue_books(){
        return "Welcome to issue books page";
    }
}
