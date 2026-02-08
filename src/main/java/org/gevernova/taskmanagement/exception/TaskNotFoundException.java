package org.gevernova.taskmanagement.exception;

public class TaskNotFoundException extends RuntimeException {
    public TaskNotFoundException(String msg) {
        super(msg);
    }
}
