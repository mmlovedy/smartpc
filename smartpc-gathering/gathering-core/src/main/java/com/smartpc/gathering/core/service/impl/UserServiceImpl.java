package com.smartpc.gathering.core.service.impl;

import com.smartpc.common.utils.ResponseEntity;
import com.smartpc.common.utils.ResponseStatus;
import com.smartpc.gathering.core.dao.PermissionMapper;
import com.smartpc.gathering.core.dao.RoleMapper;
import com.smartpc.gathering.core.dao.UserMapper;
import com.smartpc.gathering.core.po.user_role_permission.Permission;
import com.smartpc.gathering.core.po.user_role_permission.Role;
import com.smartpc.gathering.core.po.user_role_permission.User;
import com.smartpc.gathering.core.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: UserServiceImpl
 * @Package com.smartpc.gathering.core.service.impl
 * @date 2017/5/14 下午9:32
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    RoleMapper roleMapper;
    @Autowired
    PermissionMapper permissionMapper;

    private static final Logger logger = LogManager.getLogger(UserServiceImpl.class);


    public User findByUsername(User user) {
        return userMapper.queryByUsername(user);
    }

    public List<Role> findRoleByUserId(Long userId) {
        return roleMapper.queryRolesByUserId(userId);
    }

    public List<Permission> findPermissionByUserId(Long userid) {
        return permissionMapper.queryByUserId(userid);
    }

    public ResponseEntity loginByUsernamePassword(User user) {
        ResponseEntity responseEntity = new ResponseEntity();
        try {
            AuthenticationToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
            SecurityUtils.getSubject().login(token);
            responseEntity.setResponseStatus(ResponseStatus.RESPONSE_SUCCESS);
        } catch (Exception e) {
            responseEntity.setErroMessage(ResponseStatus.RESPONSE_FAILED);
            responseEntity.setErroMessage(e.getMessage());
        }
         return responseEntity;
    }
}
