package com.smartpc.gathering.core.po;

import java.io.Serializable;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: HttpAccessPo
 * @Package com.smartpc.gathering.core.po
 * @Description: http 访问地址的相关信息
 * @date 2017/5/8 下午4:10
 */
public class HttpAccessPo implements Serializable {

    /**
     * 访问地址
     */
    private String requestAddress;

    /**
     * 访问方式 get/post
     */
    private String requestMode;

    /**
     * 总耗时
     */
    private float costTime;

    /**
     * 访问次数
     */
    private int times;

    /**
     * 每次耗时
     */
    private float avgCostTime;

    /**
     * 是否存在问题
     */
    private boolean hasProblem;

    /**
     * 可能的问题原因
     */
    private String reason;

    public String getRequestAddress() {
        return requestAddress;
    }

    public void setRequestAddress(String requestAddress) {
        this.requestAddress = requestAddress;
    }

    public String getRequestMode() {
        return requestMode;
    }

    public void setRequestMode(String requestMode) {
        this.requestMode = requestMode;
    }

    public float getCostTime() {
        return costTime;
    }

    public void setCostTime(float costTime) {
        this.costTime = costTime;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public float getAvgCostTime() {
        return avgCostTime;
    }

    public void setAvgCostTime(float avgCostTime) {
        this.avgCostTime = avgCostTime;
    }

    public boolean isHasProblem() {
        return hasProblem;
    }

    public void setHasProblem(boolean hasProblem) {
        this.hasProblem = hasProblem;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
