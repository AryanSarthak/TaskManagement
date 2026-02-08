package org.gevernova.taskmanagement.service;

import org.gevernova.taskmanagement.dto.UserRequest;
import org.gevernova.taskmanagement.model.User;

import java.util.List;

public interface UserService {
    public User create(UserRequest req);
    public List<User> getAll();
}
