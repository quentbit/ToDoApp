package com.quentbit.todoapp.dao;

import com.quentbit.todoapp.entity.TaskList;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public TaskList findById(Integer id) {
        return entityManager.find(TaskList.class, id);
    }

    @Override
    public List<TaskList> findAll() {
        TypedQuery<TaskList> theQuery = entityManager.createQuery("FROM TaskList", TaskList.class);

        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(TaskList theTask) {
        entityManager.merge(theTask);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        TaskList theTask = entityManager.find(TaskList.class, id);

        entityManager.remove(theTask);
    }

    @Override
    @Transactional
    public int deleteAll() {

        int numRowsDeleted = entityManager.createQuery("DELETE FROM TaskList").executeUpdate();

        return numRowsDeleted;
    }
}
