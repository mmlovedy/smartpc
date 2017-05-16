package com.smartpc.gathering.core.dao;

import com.smartpc.gathering.core.po.user_role_permission.Permission;

import java.util.List;

public interface PermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

    List<Permission> queryByUserId(Long userId);
}