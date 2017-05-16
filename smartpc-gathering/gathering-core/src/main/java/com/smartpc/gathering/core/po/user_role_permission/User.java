package com.smartpc.gathering.core.po.user_role_permission;

import java.io.Serializable;

/**
  * @author 刘德云
  * @version V1.0
  * @Title: User
  * @Package com.smartpc.gathering.core.po.user_role_permission
  * @Description: 用户表
  * @date 2017/5/14 下午8:58
  */
public class User implements Serializable{
    private Long id;
    //名字
    private String name;
    //用户名
    private String username;
    //密码
    private String password;
    //加密密码的盐
    private String salt;
    //用户状态,0:创建未认证（比如没有激活，没有输入验证码等等）--等待验证的用户 , 1:正常状态,2：用户被锁定.
    private Byte state;

    public User() {
    }

    public User(String username) {
        this.username = username;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

     /**
      * 密码盐.
      * @return
      */
     public String getCredentialsSalt(){
         return this.username+this.salt;
     }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", state=" + state +
                '}';
    }
}