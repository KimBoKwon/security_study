package com.backend.security_study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.security_study.entity.User;
import com.backend.security_study.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repository;

    @Override
    public void join(String id, String password, String name) {
        User user = User.builder()
            .id(id)
            .password(password)
            .name(name)
            .build();
        repository.save(user);
    }
}
