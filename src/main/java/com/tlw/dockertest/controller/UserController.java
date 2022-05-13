package com.tlw.dockertest.controller;

import com.tlw.dockertest.entity.User;
import com.tlw.dockertest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
    @Autowired UserService userService;

    @RequestMapping("/login")
    public User test() {
        User user = userService.findById(1l);
        return user;
    }
}
