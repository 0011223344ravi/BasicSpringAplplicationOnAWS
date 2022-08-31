package com.example.basicspringaplplicationonaws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BasicSpringAplplicationOnAwsApplication {
   @GetMapping("/")
    public String home(){
        return " welcome to AWS first Deployment ";
    }

    public static void main(String[] args) {
        SpringApplication.run(BasicSpringAplplicationOnAwsApplication.class, args);
    }

}
