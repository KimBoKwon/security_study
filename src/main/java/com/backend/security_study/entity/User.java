package com.backend.security_study.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String password;

    private String name;
    
}
