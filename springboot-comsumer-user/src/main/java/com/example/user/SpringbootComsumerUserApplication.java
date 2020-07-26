package com.example.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.example.user.userInterface")
public class SpringbootComsumerUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootComsumerUserApplication.class, args);
    }

}
