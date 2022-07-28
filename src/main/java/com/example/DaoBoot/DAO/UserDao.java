package com.example.DaoBoot.DAO;



import com.example.DaoBoot.models.User;

import java.util.List;

public interface UserDao {
    List<User> getAll();
    void add(User user);
    void delete(Long id);
    void update(Long id, User user);
    User findById(Long id);
}
