package com.backend.security_study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.security_study.dto.UserDTO;
import com.backend.security_study.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value="/User")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private final UserService userService;
    
    @PostMapping(value="/join")
    public ResponseEntity<String> join_result(@RequestBody UserDTO userDTO) {
        userService.join(userDTO.getId(), userDTO.getPassword(), userDTO.getName());
        return ResponseEntity.ok().body("회원가입에 성공하였습니다.");
    }
}
