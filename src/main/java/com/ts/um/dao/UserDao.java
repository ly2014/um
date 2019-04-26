package com.ts.um.dao;

import com.ts.um.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    void delete(User user);

    List<User> findAll();

    User findByNum(String name);

    void update(User user);
}
