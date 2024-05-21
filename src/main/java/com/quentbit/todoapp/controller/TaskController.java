package com.quentbit.todoapp.controller;

import com.quentbit.todoapp.entity.Task;
import com.quentbit.todoapp.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService theTaskService) {
        taskService = theTaskService;
    }

    @GetMapping("/list")
    public String listTasks(Model theModel) {
        List<Task> theTasks = taskService.findAll();

        theModel.addAttribute("tasks", theTasks);

        return "tasks/list-tasks";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {
        Task theTask = new Task();

        theModel.addAttribute("task", theTask);

        return "tasks/task-form";
    }

    @PostMapping("/save")
    public String saveTask(@ModelAttribute("task") Task theTask) {
        taskService.save(theTask);

        return "redirect:/tasks/list";
    }
}
