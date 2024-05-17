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

    @Bean
    public CommandLineRunner commandLineRunner(TaskListDAO taskListDAO) {

        return runner -> {
            //createTask(taskListDAO);

            //createMultipleTasks(taskListDAO);

            //readTask(taskListDAO);

            //queryForTasks(taskListDAO);

            updateTask(taskListDAO);
        };
    }

    private void updateTask(TaskListDAO taskListDAO) {

        int taskId = 5;
        System.out.println("Getting student with id: " + taskId);
        TaskList myTask = taskListDAO.findById(taskId);

        System.out.println("Updating task ...");
        myTask.setTask("Test update method");

        taskListDAO.update(myTask);

        System.out.println("Updated task: " + myTask);
    }

    private void queryForTasks(TaskListDAO taskListDAO) {

        List<TaskList> theTasks = taskListDAO.findAll();

        for (TaskList tempTask : theTasks) {
            System.out.println(tempTask);
        }
    }

    private void readTask(TaskListDAO taskListDAO) {

        System.out.println("Creating new task object ...");
        TaskList tempTask = new TaskList("Test read method");

        System.out.println("Saving the task ...");
        taskListDAO.save(tempTask);

        int theId = tempTask.getId();
        System.out.println("Saved task. Generated id: " + theId);

        System.out.println("Retrieving task with id: " + theId);
        TaskList myTask = taskListDAO.findById(theId);

        System.out.println("Found the task: " + myTask);
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
