package com.demo.repo;

import com.demo.entityes.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users,Integer> {

    Users findByName(String name);
}
