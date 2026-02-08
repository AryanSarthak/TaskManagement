package org.gevernova.taskmanagement.controller;



import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.gevernova.taskmanagement.dto.UserRequest;
import org.gevernova.taskmanagement.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    // Create user API
    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody UserRequest req) {
        return ResponseEntity.ok(service.create(req));
    }

    // Get users API
    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(service.getAll());
    }
}
