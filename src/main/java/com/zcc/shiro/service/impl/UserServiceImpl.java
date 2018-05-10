package com.zcc.shiro.service.impl;

import com.zcc.shiro.mapper.UserMapper;
import com.zcc.shiro.model.User;
import com.zcc.shiro.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户业务实现类
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User findByUserName(String username) {
        return null;
    }
}
