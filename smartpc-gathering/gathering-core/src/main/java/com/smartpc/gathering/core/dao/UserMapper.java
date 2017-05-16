package com.smartpc.gathering.core.dao;


import com.smartpc.gathering.core.po.user_role_permission.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User queryByUsername(User user);
}