package com.quentbit.todoapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TodoappApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoappApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(String[] args) {

        return runner -> {
            System.out.println("Hello World");
        };
    }
}
