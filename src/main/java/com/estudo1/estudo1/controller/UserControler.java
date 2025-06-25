package com.estudo1.estudo1.controller;

import com.estudo1.estudo1.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/user")
public class UserControler {
    @GetMapping
    public ResponseEntity<User> GetUser(){
        User u = new User(1,"Rosa");
        return ResponseEntity.ok().body(u);
    }
}
