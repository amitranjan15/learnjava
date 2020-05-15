package com.demo.controller;

import com.demo.entityes.Users;
import com.demo.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserConroller {

    @Autowired
    private UserServiceImp userServiceImp;

    @PostMapping(value = "/")
    public ResponseEntity<Users> add(@RequestBody Users user)
    {
        return new ResponseEntity<>(userServiceImp.add(user), HttpStatus.CREATED);
    }
}
