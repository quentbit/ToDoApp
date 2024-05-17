package com.quentbit.todoapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name="task_list")
public class TaskList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="task")
    private String task;

    public TaskList() {
    }

    public TaskList(String task) {
        this.task = task;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "id=" + id +
                ", task='" + task + '\'' +
                '}';
    }
}
