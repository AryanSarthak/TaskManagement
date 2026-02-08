package org.gevernova.taskmanagement.controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.gevernova.taskmanagement.dto.TaskRequest;
import org.gevernova.taskmanagement.model.TaskStatus;
import org.gevernova.taskmanagement.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService service;

    // Create task API
    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody TaskRequest req) {
        return ResponseEntity.ok(service.create(req));
    }

    // Get tasks API
    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    // Update task status API
    @PutMapping("/{id}/status")
    public ResponseEntity<?> updateStatus(
            @PathVariable Long id,
            @RequestParam TaskStatus status) {
        return ResponseEntity.ok(service.updateStatus(id, status));
    }
}
