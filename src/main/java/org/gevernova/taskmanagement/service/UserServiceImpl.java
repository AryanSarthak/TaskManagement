package org.gevernova.taskmanagement.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.gevernova.taskmanagement.dto.UserRequest;
import org.gevernova.taskmanagement.model.User;
import org.gevernova.taskmanagement.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    @Override
    public User create(UserRequest req) {
        log.info("Creating user {}", req.getEmail());
        User u = new User();
        u.setName(req.getName());
        u.setEmail(req.getEmail());
        return userRepository.save(u);
    }

    @Override
    public List<User> getAll() {
        log.info("Fetching all users");
        return userRepository.findAll();
    }
}
