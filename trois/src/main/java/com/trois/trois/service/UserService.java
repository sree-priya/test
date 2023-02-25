package com.trois.trois.service;

import com.trois.trois.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
     List<User> getUser();
     Optional<User> getUserById(Long userId);
     void addUser(User user);
     void deleteUserById();

}
