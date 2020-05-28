package com.demo.controller;

import com.demo.entityes.Users;
import com.demo.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

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

    @GetMapping(value = "/{name}")
    public ResponseEntity<?> getUSer(@PathVariable String name) throws InterruptedException, ExecutionException, TimeoutException {
        return new ResponseEntity<>(userServiceImp.findByName(name), HttpStatus.OK);
    }
}
