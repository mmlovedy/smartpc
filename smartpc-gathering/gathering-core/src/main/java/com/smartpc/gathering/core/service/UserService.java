package com.smartpc.gathering.core.service;

import com.smartpc.common.utils.ResponseEntity;
import com.smartpc.gathering.core.po.user_role_permission.Permission;
import com.smartpc.gathering.core.po.user_role_permission.Role;
import com.smartpc.gathering.core.po.user_role_permission.User;

import java.util.List;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: UserService
 * @Package com.smartpc.gathering.core.service
 * @Description: 用户权限相关
 * @date 2017/5/14 下午9:31
 */
public interface UserService {
    /**
     * 通过用户名查找用户信息
     * @param user
     * @return
     */
    public User findByUsername(User user);

    /**
     * 通过用户 ID 查询角色
     * @param userId
     * @return
     */
    public List<Role> findRoleByUserId(Long userId);

    /**
     * 通过用户查询权限
     * @param userid
     * @return
     */
    public List<Permission> findPermissionByUserId(Long userid);

    /**
     * 验证登录
     * @param user
     * @return
     */
    public ResponseEntity loginByUsernamePassword(User user);
}
