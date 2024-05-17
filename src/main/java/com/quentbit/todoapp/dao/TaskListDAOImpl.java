package com.quentbit.todoapp.dao;

import com.quentbit.todoapp.entity.TaskList;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class TaskListDAOImpl implements TaskListDAO {

    private EntityManager entityManager;

    public TaskListDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(TaskList theTask) {
        entityManager.persist(theTask);
    }
}
