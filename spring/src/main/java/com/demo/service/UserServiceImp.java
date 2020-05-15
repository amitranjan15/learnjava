package com.demo.service;

import com.demo.entityes.Users;
import com.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp {

    @Autowired
    private UserRepo userRepo;

    public Users add(Users user)
    {
        return  userRepo.saveAndFlush(user);
    }

    public Users findByName(String name)
    {
        return userRepo.findByName(name);
    }
}
