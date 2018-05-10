package com.zcc.shiro.service;

import com.zcc.shiro.model.User;

public interface UserService {

    User findByUserName(String username);
}
