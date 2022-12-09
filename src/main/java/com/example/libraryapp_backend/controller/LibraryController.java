package com.example.libraryapp_backend.controller;

import com.example.libraryapp_backend.dao.Booksdao;
import com.example.libraryapp_backend.dao.Issuedao;
import com.example.libraryapp_backend.dao.Userdao;
import com.example.libraryapp_backend.model.BooksModel;
import com.example.libraryapp_backend.model.IssueModel;
import com.example.libraryapp_backend.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

public class LibraryController {

    @Autowired
    private Booksdao dao;

    @Autowired
    private Issuedao idao;

    @Autowired
    private Userdao udao;

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



    @CrossOrigin(origins = "*")
    @PostMapping(path="/entry",consumes = "application/json",produces = "application/json")
    public Map<String,String> Books_entry(@RequestBody BooksModel b){
        dao.save(b);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<BooksModel> Books_view()
    {
        return (List<BooksModel>) dao.findAll();
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path="/search",consumes = "application/json",produces = "application/json")
    public List<BooksModel> Books_search(@RequestBody BooksModel b){
        return (List<BooksModel>) dao.SearchBooks(b.getName());
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path="/delete",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> Books_delete(@RequestBody BooksModel b){
        dao.DeleteBook(b.getId());
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }




    @PostMapping("/edit")
    public String Books_edit(){
        return "Welcome to books edit page";
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path="/issue",consumes = "application/json",produces = "application/json")
    public Map<String,String> Issue_books(@RequestBody IssueModel b){
        idao.save(b);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }



    @CrossOrigin(origins = "*")
    @PostMapping(path="/reg",consumes = "application/json",produces = "application/json")
    public Map<String,String> User_entry(@RequestBody UserModel u){
        udao.save(u);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }


    @CrossOrigin(origins = "*")
    @GetMapping("/uview")
    public List<UserModel> User_view()
    {
        return (List<UserModel>) udao.findAll();
    }



}
