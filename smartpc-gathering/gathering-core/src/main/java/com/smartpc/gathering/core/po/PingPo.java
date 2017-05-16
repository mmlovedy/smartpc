package com.smartpc.gathering.core.po;

import java.io.Serializable;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: PingPo
 * @Package com.smartpc.gathering.core.po
 * @Description: ping 的相关信息
 * @date 2017/5/8 下午4:04
 */
public class PingPo implements Serializable {

    /**
     * ping 的地址
     */
    private String pingAddress;

    /**
     * ping 的次数
     */
    private float times;

    /**
     * 最长耗时
     */
    private float maxCostTime;

    /**
     * 最短耗时
     */
    private float minCostTime;

    /**
     * 平均耗时 ms 单位毫秒
     */
    private float avgCostTime;

    /**
     * 丢包率 小数  如丢包率为50%,则为0.5
     */
    private double packetLossRate;

    public String getPingAddress() {
        return pingAddress;
    }

    public void setPingAddress(String pingAddress) {
        this.pingAddress = pingAddress;
    }

    public float getTimes() {
        return times;
    }

    public void setTimes(float times) {
        this.times = times;
    }

    public float getMaxCostTime() {
        return maxCostTime;
    }

    public void setMaxCostTime(float maxCostTime) {
        this.maxCostTime = maxCostTime;
    }

    public float getMinCostTime() {
        return minCostTime;
    }

    public void setMinCostTime(float minCostTime) {
        this.minCostTime = minCostTime;
    }

    public float getAvgCostTime() {
        return avgCostTime;
    }

    public void setAvgCostTime(float avgCostTime) {
        this.avgCostTime = avgCostTime;
    }

    public double getPacketLossRate() {
        return packetLossRate;
    }

    public void setPacketLossRate(double packetLossRate) {
        this.packetLossRate = packetLossRate;
    }
}
