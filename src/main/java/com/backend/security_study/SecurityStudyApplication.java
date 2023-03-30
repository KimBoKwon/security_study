package com.backend.security_study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SecurityStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityStudyApplication.class, args);
	}

}
