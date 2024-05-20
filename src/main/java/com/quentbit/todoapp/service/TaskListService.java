package com.quentbit.todoapp.service;

import com.quentbit.todoapp.entity.TaskList;

import java.util.List;

public interface TaskListService {

    List<TaskList> findAll();
}
