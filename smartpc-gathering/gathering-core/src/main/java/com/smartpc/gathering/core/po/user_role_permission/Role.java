package com.smartpc.gathering.core.po.user_role_permission;

import java.io.Serializable;
import java.util.List;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: Role
 * @Package com.smartpc.gathering.core.po.user_role_permission
 * @Description: 角色权限对应关系
 * @date 2017/5/14 下午8:57
 */
public class Role implements Serializable {
    private Long id;
    //是否有效
    private Boolean available;
    //角色描述
    private String description;
    //角色
    private String role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }
}