package com.zcc.shiro.model;

import java.util.HashSet;
import java.util.Set;

/**
 * 角色实体类
 */
public class Role {
    /**角色ID**/
    private Integer rid;

    /**角色名称**/
    private String rname;

    /**权限集合**/
    private Set<Permission> permissionSet = new HashSet<>(); //一个角色可能有多个权限

    /**用户集合**/
    private Set<User> users = new HashSet<>();//一个角色可能有多个用户

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Set<Permission> getPermissionSet() {
        return permissionSet;
    }

    public void setPermissionSet(Set<Permission> permissionSet) {
        this.permissionSet = permissionSet;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
