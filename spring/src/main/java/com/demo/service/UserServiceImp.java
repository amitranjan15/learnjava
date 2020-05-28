package com.demo.service;

import com.demo.entityes.Users;
import com.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Service
public class UserServiceImp {

    @Autowired
    private UserRepo userRepo;

    public Users add(Users user)
    {
        return  userRepo.saveAndFlush(user);
    }

    public List<Users> findByName(String name) throws InterruptedException, ExecutionException, TimeoutException {
        System.out.println("1");
        System.out.println(Thread.currentThread().getName());

        CompletableFuture<List<Users>> c=userRepo.findByName(name);
        System.out.println("2");
        CompletableFuture.allOf(c);
        System.out.println("3");
        List<Users> u=c.get(1, TimeUnit.SECONDS);
        System.out.println("4");

        return u;
    }


}
