package com.tlw.dockertest.service.impl;

import com.tlw.dockertest.entity.User;
import com.tlw.dockertest.mapper.UserMapper;
import com.tlw.dockertest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired UserMapper userMapper;

    @Override
    public User findById(Long id) {
        return userMapper.selectById(id);
    }
}
