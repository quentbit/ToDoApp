package com.quentbit.todoapp.rest;

import com.quentbit.todoapp.entity.TaskList;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskListRestController {

    private List<TaskList> theTasks;

    @PostConstruct
    public void loadData() {

        theTasks = new ArrayList<>();

        theTasks.add(new TaskList("Todo Task 1"));
        theTasks.add(new TaskList("Todo Task 2"));
        theTasks.add(new TaskList("Todo Task 3"));
    }

    @GetMapping("/tasks")
    public List<TaskList> getTasks() {

        return theTasks;
    }

    @GetMapping("/tasks/{taskId}")
    public TaskList getTask(@PathVariable int taskId) {

        return theTasks.get(taskId);
    }
}
