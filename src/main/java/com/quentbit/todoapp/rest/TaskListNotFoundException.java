package com.quentbit.todoapp.rest;

public class TaskListNotFoundException extends RuntimeException{

    public TaskListNotFoundException(String message) {
        super(message);
    }

    public TaskListNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public TaskListNotFoundException(Throwable cause) {
        super(cause);
    }
}
