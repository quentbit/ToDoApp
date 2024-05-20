package com.quentbit.todoapp.service;

import com.quentbit.todoapp.dao.TaskListDAO;
import com.quentbit.todoapp.entity.TaskList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskListServiceImpl implements TaskListService{

    private TaskListDAO taskListDAO;

    public TaskListServiceImpl(TaskListDAO theTaskListDAO) {
        taskListDAO = theTaskListDAO;
    }

    @Override
    public List<TaskList> findAll() {
        return taskListDAO.findAll();
    }
}
