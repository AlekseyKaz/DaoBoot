package com.example.DaoBoot.service;

import com.example.DaoBoot.models.User;
import com.example.DaoBoot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }
    public User findById(long id) {
        return userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
    }

    public void delete(User user) {
        userRepository.delete(user);
    }

    public List<User> findAll() {
       List<User> user = (List<User>) userRepository.findAll();
       return user;
    }
}
