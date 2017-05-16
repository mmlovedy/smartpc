package com.smartpc.gathering.core.dao;


import com.smartpc.gathering.core.po.user_role_permission.Role;
import com.smartpc.gathering.core.po.user_role_permission.UserRole;

import java.util.List;

public interface UserRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}