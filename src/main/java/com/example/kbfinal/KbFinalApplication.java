package com.example.kbfinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.kbfinal.repository")
public class KbFinalApplication {

    public static void main(String[] args) {
        SpringApplication.run(KbFinalApplication.class, args);
    }

}
