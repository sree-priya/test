package com.trois.trois.service.impl;

import com.trois.trois.model.User;
import com.trois.trois.repo.UserRepository;
import com.trois.trois.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getUser() {
        return null;
    }

    @Override
    public Optional<User> getUserById(Long userId) {
       Optional<User> user= userRepository.findById(userId);
        return user;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void deleteUserById() {

    }
}
