package com.example.Hibernate_project.service;

import com.example.Hibernate_project.Model.User;
import com.example.Hibernate_project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository ur;

    public User saveUser(User user) {
        ur.save(user);
        return user;
    }

    public List<User> getAllUsers() {
        ur.findAll();
        return List.of();
    }

    public User getUserById(Long id) {
        return ur.findById(id).orElse(null);
    }

    public void deleteUser(Long id) {
        ur.deleteById(id);
    }
}
