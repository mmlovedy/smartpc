package com.smartpc.gathering.core.po.user_role_permission;

import java.io.Serializable;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: RolePermission
 * @Package com.smartpc.gathering.core.po.user_role_permission
 * @Description: 权限角色对应关系
 * @date 2017/5/14 下午8:53
 */
public class RolePermission implements Serializable {
    private Long id;
    //角色 ID
    private Long roleid;
    //权限 ID
    private Long permissionid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public Long getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Long permissionid) {
        this.permissionid = permissionid;
    }
}