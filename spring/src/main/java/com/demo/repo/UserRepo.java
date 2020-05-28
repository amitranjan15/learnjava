package com.demo.repo;

import com.demo.entityes.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Repository
public interface UserRepo extends JpaRepository<Users,Integer> {

    @Async
    CompletableFuture<List<Users>> findByName(String name);
}
