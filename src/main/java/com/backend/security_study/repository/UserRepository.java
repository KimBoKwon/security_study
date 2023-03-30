package com.backend.security_study.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.backend.security_study.entity.User;

public interface UserRepository extends JpaRepository<User, String>{
    
}
