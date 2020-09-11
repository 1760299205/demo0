package com.example.demo5.code.textone.heiehei.service;

import com.example.demo5.code.textone.heiehei.dao.UserMapper;
import com.example.demo5.code.textone.heiehei.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> queryUserInfo() {
        return userMapper.queryUserInfo();
    }
}
