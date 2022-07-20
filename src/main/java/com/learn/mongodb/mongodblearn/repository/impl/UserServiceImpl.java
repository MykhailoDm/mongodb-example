package com.learn.mongodb.mongodblearn.repository.impl;

import com.learn.mongodb.mongodblearn.entity.User;
import com.learn.mongodb.mongodblearn.repository.UserRepository;
import com.learn.mongodb.mongodblearn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
