package com.ts.um.dao.impl;

import com.ts.um.dao.UserDao;
import com.ts.um.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDaoImpl")
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void add(User user) {
        String sql = "insert into user (username,password) values (?,?)";
        jdbcTemplate.update(sql, new Object[]{255, 255});
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findByNum(String name) {
        return null;
    }

    @Override
    public void update(User user) {

    }
}
