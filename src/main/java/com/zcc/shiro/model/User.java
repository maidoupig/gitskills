package com.zcc.shiro.model;

import java.util.HashSet;
import java.util.Set;

/**
 * 用户实体类
 */
public class User {

    /**用户ID**/
    private Integer uid;

    /**用户名称**/
    private String username;

    /**密码**/
    private  String password;

    /**角色集合**/
    private Set<Role> roles = new HashSet<>(); //一个用户可能会有多种角色

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
