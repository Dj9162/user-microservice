package com.firstmicroservices.service;

import com.firstmicroservices.model.User;
import com.firstmicroservices.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    // Read
    public List<User> findAll() {
        return userRepo.findAll();
    }

    // Create or Update
    public User save(User user) {
        return userRepo.save(user);
    }

    public User findUserById(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    // Delete
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }

}
