package com.quentbit.todoapp.service;

import com.quentbit.todoapp.dao.TaskRepository;
import com.quentbit.todoapp.entity.Task;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    //private TaskDAO taskDAO;
    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository theTaskRepository) {

        taskRepository = theTaskRepository;
    }

    @Override
    public List<Task> findAll() {

        return taskRepository.findAll();
    }

    @Override
    public Task findById(int theId) {
        Optional<Task> result = taskRepository.findById(theId);

        Task theTask = null;

        if (result.isPresent()) {
            theTask = result.get();
        }
        else {
            throw new RuntimeException("Did not find task id - " + theId);
        }

        return theTask;
    }

    @Override
    public void save(Task theTask) {
        taskRepository.save(theTask);
    }

    @Override
    public void deleteById(int theId) {
        taskRepository.deleteById(theId);
    }

}
