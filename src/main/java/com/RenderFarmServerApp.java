package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class RenderFarmServerApp {
    public static void main(String[] args) {
        SpringApplication.run(RenderFarmServerApp.class, args);
    }
}
