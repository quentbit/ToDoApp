package com.quentbit.todoapp.dao;

import com.quentbit.todoapp.entity.TaskList;

import java.util.List;

public interface TaskListDAO {

    void save(TaskList theTask);

    TaskList findById(Integer id);

    List<TaskList> findAll();
}
