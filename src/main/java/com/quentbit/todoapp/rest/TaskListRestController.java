package com.quentbit.todoapp.rest;

import com.quentbit.todoapp.dao.TaskListDAO;
import com.quentbit.todoapp.entity.TaskList;
import com.quentbit.todoapp.service.TaskListService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskListRestController {

    private TaskListService taskListService;

    @Autowired
    public TaskListRestController(TaskListService theTaskListService) {
        taskListService = theTaskListService;
    }

    @GetMapping("/tasks")
    public List<TaskList> findAll() {
        return taskListService.findAll();
    }

}
