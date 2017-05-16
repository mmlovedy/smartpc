package com.smartpc.gathering.core.po;

import java.io.Serializable;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: TracertPo
 * @Package com.smartpc.gathering.core.po
 * @Description: 路由跟踪信息
 * @date 2017/5/8 下午4:07
 */
public class TracertPo implements Serializable {

    /**
     * 路由地址
     */
    private String tracertAddress;

    /**
     * 路由返回信息
     */
    private String trcertInfo;

    public String getTracertAddress() {
        return tracertAddress;
    }

    public void setTracertAddress(String tracertAddress) {
        this.tracertAddress = tracertAddress;
    }

    public String getTrcertInfo() {
        return trcertInfo;
    }

    public void setTrcertInfo(String trcertInfo) {
        this.trcertInfo = trcertInfo;
    }
}
