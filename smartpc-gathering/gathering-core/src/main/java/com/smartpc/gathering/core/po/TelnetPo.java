package com.smartpc.gathering.core.po;

import java.io.Serializable;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: TelnetPo
 * @Package com.smartpc.gathering.core.po
 * @Description: telnet 端口的相关信息
 * @date 2017/5/8 下午4:05
 */
public class TelnetPo implements Serializable {

    /**
     * 地址
     */
    private String telnetAddress;

    /**
     * 端口
     */
    private String telnetPort;

    /**
     * 是否成功
     */
    private boolean isSuccess;

    /**
     * 默认超时时间 单位 毫秒
     */
    private float defaultOvertime;

    public String getTelnetAddress() {
        return telnetAddress;
    }

    public void setTelnetAddress(String telnetAddress) {
        this.telnetAddress = telnetAddress;
    }

    public String getTelnetPort() {
        return telnetPort;
    }

    public void setTelnetPort(String telnetPort) {
        this.telnetPort = telnetPort;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public float getDefaultOvertime() {
        return defaultOvertime;
    }

    public void setDefaultOvertime(float defaultOvertime) {
        this.defaultOvertime = defaultOvertime;
    }
}
