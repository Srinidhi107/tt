package com.example.myapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.myapp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
