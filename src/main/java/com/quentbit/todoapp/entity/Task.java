package com.quentbit.todoapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name="task_list")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="task")
    private String taskDescription;

    public Task() {
    }

    public Task(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String task) {
        this.taskDescription = task;
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "id=" + id +
                ", task='" + taskDescription + '\'' +
                '}';
    }
}
