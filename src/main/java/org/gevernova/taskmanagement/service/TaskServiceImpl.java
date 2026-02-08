package org.gevernova.taskmanagement.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.gevernova.taskmanagement.dto.TaskRequest;
import org.gevernova.taskmanagement.exception.TaskNotFoundException;
import org.gevernova.taskmanagement.exception.UserNotFoundException;
import org.gevernova.taskmanagement.model.*;
import org.gevernova.taskmanagement.repository.CategoryRepository;
import org.gevernova.taskmanagement.repository.PriorityRepository;
import org.gevernova.taskmanagement.repository.TaskRepository;
import org.gevernova.taskmanagement.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService{

    private final TaskRepository taskRepo;
    private final UserRepository userRepo;
    private final CategoryRepository categoryRepo;
    private final PriorityRepository priorityRepo;

    // Create new task
    public Task create(TaskRequest req) {

        User user = userRepo.findById(req.getUserId())
                .orElseThrow(() -> new UserNotFoundException("User not found"));

        Category cat = categoryRepo.findById(req.getCategoryId())
                .orElseThrow(RuntimeException::new);

        Priority pr = priorityRepo.findById(req.getPriorityId())
                .orElseThrow(RuntimeException::new);

        Task t = new Task();
        t.setTitle(req.getTitle());
        t.setDescription(req.getDescription());
        t.setStatus(TaskStatus.PENDING);
        t.setUser(user);
        t.setCategory(cat);
        t.setPriority(pr);

        return taskRepo.save(t);
    }

    // Get all tasks
    public List<Task> getAll() {
        return taskRepo.findAll();
    }

    // Update task status
    public Task updateStatus(Long id, TaskStatus status) {
        Task t = taskRepo.findById(id)
                .orElseThrow(() -> new TaskNotFoundException("Task not found"));
        t.setStatus(status);
        return taskRepo.save(t);
    }
}
