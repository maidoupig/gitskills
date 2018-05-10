package com.zcc.shiro.mapper;

import com.zcc.shiro.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * 用户数据访问层
 */
public interface UserMapper {

    User findByUserName(@Param("username") String username);
}
