package com.tlw.dockertest.service;


import com.tlw.dockertest.entity.User;

public interface UserService {
    User findById(Long id);
}
