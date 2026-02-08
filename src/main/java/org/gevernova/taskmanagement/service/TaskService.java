package org.gevernova.taskmanagement.service;

import org.gevernova.taskmanagement.dto.TaskRequest;
import org.gevernova.taskmanagement.model.Task;
import org.gevernova.taskmanagement.model.TaskStatus;

import java.util.List;

public interface TaskService {
    public Task create(TaskRequest req);

    public List<Task> getAll();

    public Task updateStatus(Long id, TaskStatus status);
}
