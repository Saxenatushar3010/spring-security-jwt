package com.spring.jwt;

import com.spring.jwt.request.RegisterRequest;
import com.spring.jwt.service.AuthService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.spring.jwt.entity.Role.ADMIN;
import static com.spring.jwt.entity.Role.MANAGER;


@SpringBootApplication
@EnableAutoConfiguration
public class DemoApplication {

    @Autowired
    AuthService service;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

//    @PostConstruct
//    public void init() {
//        var admin = RegisterRequest.builder()
//                .firstName("Admin")
//                .lastName("Admin")
//                .email("admin@mail.com")
//                .password("password")
//                .role(ADMIN)
//                .build();
//        System.out.println("Admin token: " + service.register(admin).getAccessToken());
//
//        var manager = RegisterRequest.builder()
//                .firstName("Admin")
//                .lastName("Admin")
//                .email("manager@mail.com")
//                .password("password")
//                .role(MANAGER)
//                .build();
//        System.out.println("Manager token: " + service.register(manager).getAccessToken());
//
//    }
@Bean
public CommandLineRunner commandLineRunner(AuthService service) {
    return args -> {
        var admin = RegisterRequest.builder()
                .firstName("Admin")
                .lastName("Admin")
                .email("admin@mail.com")
                .password("password")
                .role(ADMIN)
                .build();
        System.out.println("Admin token: " + service.register(admin).getAccessToken());

        var manager = RegisterRequest.builder()
                .firstName("Admin")
                .lastName("Admin")
                .email("manager@mail.com")
                .password("password")
                .role(MANAGER)
                .build();
        System.out.println("Manager token: " + service.register(manager).getAccessToken());

    };
}
}
