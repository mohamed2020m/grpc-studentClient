package com.leeuw.grpcstudentclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.leeuw.controllers"})
public class GrpcStudentClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpcStudentClientApplication.class, args);
    }

}
