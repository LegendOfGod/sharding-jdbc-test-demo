package com.example.shardingjdbcdemo.controller;

import com.example.shardingjdbcdemo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lqb
 * @date 2022/4/15 21:59
 */
@RestController
@RequestMapping("/test")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/testUser")
    public void testUser() {
        userService.test();
    }

}
