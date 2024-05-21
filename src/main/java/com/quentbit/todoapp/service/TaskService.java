package com.quentbit.todoapp.service;

import com.quentbit.todoapp.entity.Task;

import java.util.List;

public interface TaskService {

    List<Task> findAll();

    Task findById(int theId);

    void save(Task theTask);

    void deleteById(int theId);

    //int deleteAll();
}
