package com.smartpc.gathering.core.po.user_role_permission;

import java.io.Serializable;
import java.util.List;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: Permission
 * @Package com.smartpc.gathering.core.po.user_role_permission
 * @Description: 资源权限列表
 * @date 2017/5/14 下午8:57
 */
public class Permission implements Serializable {
    //主键
    private Long id;
    //是否有效
    private Boolean available;
    //名称
    private String name;
    //父编号
    private Long parentid;
    //父编号列表
    private String parentids;
    //权限字符串,menu例子：role:*，button例子：role:create,role:update,role:delete,role:view
    private String permission;
    //资源类型 url、button、menu
    private String resourcetype;
    //路径
    private String url;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    public String getParentids() {
        return parentids;
    }

    public void setParentids(String parentids) {
        this.parentids = parentids == null ? null : parentids.trim();
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    public String getResourcetype() {
        return resourcetype;
    }

    public void setResourcetype(String resourcetype) {
        this.resourcetype = resourcetype == null ? null : resourcetype.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}