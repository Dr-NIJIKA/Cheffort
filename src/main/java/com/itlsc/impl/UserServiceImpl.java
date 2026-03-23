package com.itlsc.impl;

import com.itlsc.entity.User;
import com.itlsc.mapper.UserMapper;
import com.itlsc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User login(User user) {
        User dbUser = userMapper.getUserByName(user.getUsername());
        if (dbUser != null && dbUser.getPassword().equals(user.getPassword())) {
            return dbUser;
        }
        return null;
    }
}
