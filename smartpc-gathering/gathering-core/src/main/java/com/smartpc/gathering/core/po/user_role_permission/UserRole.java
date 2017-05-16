package com.smartpc.gathering.core.po.user_role_permission;

import java.io.Serializable;

/**
  * @author 刘德云
  * @version V1.0
  * @Title: UserRole
  * @Package com.smartpc.gathering.core.po.user_role_permission
  * @Description: 用户角色对应关系表
  * @date 2017/5/14 下午8:58
  */
public class UserRole implements Serializable {
    private Long id;
    //用户 id
    private Long uid;
    //角色 id
    private Long roleid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }
}