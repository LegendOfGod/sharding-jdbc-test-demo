package com.example.shardingjdbcdemo.service;

import com.example.shardingjdbcdemo.mapper.UserMapper;
import com.example.shardingjdbcdemo.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lqb
 * @date 2022/4/15 22:03
 */
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public void test() {
        // 插入测试
        for (long i = 1; i <= 10; i++) {
            User user = new User();
            user.setId(i);
            user.setName("Name_" + i);
            user.setPhone("phone");
            user.setEmail("email");
            userMapper.insertTable(user);
        }
    }
}
