package com.example.DaoBoot.service;


import com.example.DaoBoot.dao.UserDao;
import com.example.DaoBoot.models.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    @Transactional
    public void add(User user) {
    userDao.add(user);
    }

    @Override
    @Transactional

    public void delete(Long id) {
    userDao.delete(id);
    }

    @Override
    @Transactional
    public void update(Long id, User user) {
    userDao.update(id, user);
    }

    @Override
    @Transactional
    public User findById(Long id) {
        return userDao.findById(id);
    }
}
