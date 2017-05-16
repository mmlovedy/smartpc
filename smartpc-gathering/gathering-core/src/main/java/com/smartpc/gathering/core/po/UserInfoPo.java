package com.smartpc.gathering.core.po;

import java.io.Serializable;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: User
 * @Package com.smartpc.gathering.core.dto
 * @Description:  目标公司的电脑用户信息
 * @date 2017/5/8 上午11:23
 */
public class UserInfoPo implements Serializable {
    /**
     * 工号
     */
    private String userCode;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 手机
     */
    private String mobile;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
