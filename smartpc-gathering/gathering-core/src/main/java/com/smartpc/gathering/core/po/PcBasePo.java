package com.smartpc.gathering.core.po;

import java.io.Serializable;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: PcInfo
 * @Package com.smartpc.gathering.core.po
 * @Description: 主机基本信息信息
 * @date 2017/5/8 上午11:33
 */
public class PcBasePo implements Serializable {

    /**
     * mac地址
     */
    private String mac;

    /**
     * 操作系统
     */
    private String os;

    /**
     * cpu 架构
     */
    private String cpuInfo;

    /**
     * 物理内存
     */
    private String physicalMemory;

    /**
     * java 版本
     */
    private String javaVersion;

    /**
     * java_home
     */
    private String javaHome;

    /**
     * 电脑当前登录用户
     */
    private String currentLoginUser;

    /**
     * 客户端登录的用户信息
     */
    private UserInfoPo userInfoPo;


    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getCpuInfo() {
        return cpuInfo;
    }

    public void setCpuInfo(String cpuInfo) {
        this.cpuInfo = cpuInfo;
    }

    public String getPhysicalMemory() {
        return physicalMemory;
    }

    public void setPhysicalMemory(String physicalMemory) {
        this.physicalMemory = physicalMemory;
    }

    public String getJavaVersion() {
        return javaVersion;
    }

    public void setJavaVersion(String javaVersion) {
        this.javaVersion = javaVersion;
    }

    public String getJavaHome() {
        return javaHome;
    }

    public void setJavaHome(String javaHome) {
        this.javaHome = javaHome;
    }

    public String getCurrentLoginUser() {
        return currentLoginUser;
    }

    public void setCurrentLoginUser(String currentLoginUser) {
        this.currentLoginUser = currentLoginUser;
    }

    public UserInfoPo getUserInfoPo() {
        return userInfoPo;
    }

    public void setUserInfoPo(UserInfoPo userInfoPo) {
        this.userInfoPo = userInfoPo;
    }
}
