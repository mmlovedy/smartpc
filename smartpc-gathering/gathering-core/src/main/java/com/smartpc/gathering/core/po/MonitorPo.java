package com.smartpc.gathering.core.po;

import java.io.Serializable;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: MonitorPo
 * @Package com.smartpc.gathering.core.po
 * @Description: 实时监控信息
 * @date 2017/5/10 上午8:29
 */
public class MonitorPo<T> implements Serializable {

    /**
     * 监控项 ID
     */
    private Long itemid;

    /**
     * 监控项值,根据传入的类型
     */
    private T value;

    public Long getItemid() {
        return itemid;
    }

    public void setItemid(Long itemid) {
        this.itemid = itemid;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    /**
     * 当前已使用内存
     */
    //private String usagePhysicalMemory;

    /**
     * 已使用内存比率 小数如 0.5
     */
    //private float usagePhysicalMemoryRate;

    /**
     * cpu 使用率
     */
    //private String cpuUsageRate;
}
