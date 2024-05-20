package com.quentbit.todoapp;

import com.quentbit.todoapp.dao.TaskListDAO;
import com.quentbit.todoapp.entity.TaskList;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class TodoappApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoappApplication.class, args);
    }

}
