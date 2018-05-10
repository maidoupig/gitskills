package com.zcc.shiro.model;

/**
 * 权限实体类
 */
public class Permission {
    /**权限ID**/
    private Integer pid;

    /**权限名称**/
    private String name;

    /**权限路径**/
    private String url;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
