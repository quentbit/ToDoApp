package com.quentbit.todoapp;

import com.quentbit.todoapp.dao.TaskListDAO;
import com.quentbit.todoapp.entity.TaskList;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TodoappApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoappApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(TaskListDAO taskListDAO) {

        return runner -> {
            //createTask(taskListDAO);

            createMultipleTasks(taskListDAO);
        };
    }

    private void createMultipleTasks(TaskListDAO taskListDAO) {

        System.out.println("Creating 3 taskList objects ...");
        TaskList tempTask1 = new TaskList("Create read method");
        TaskList tempTask2 = new TaskList("Create update method");
        TaskList tempTask3 = new TaskList("Create delete method");

        System.out.println("Saving the tasks ...");
        taskListDAO.save(tempTask1);
        taskListDAO.save(tempTask2);
        taskListDAO.save(tempTask3);
    }

    private void createTask(TaskListDAO taskListDAO) {

        System.out.println("Creating new taskList object ...");
        TaskList tempTask = new TaskList("Creating save method");

        System.out.println("Saving the task ...");
        taskListDAO.save(tempTask);

        System.out.println("Saved task. Generated id: " + tempTask.getId());
    }
}
