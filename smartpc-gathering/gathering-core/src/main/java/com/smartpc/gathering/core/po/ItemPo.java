package com.smartpc.gathering.core.po;

import java.io.Serializable;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: Item
 * @Package com.smartpc.gathering.core.po
 * @Description: 监控项说明
 * @date 2017/5/10 上午10:54
 */
public class ItemPo implements Serializable{

    /**
     * 主键
     */
    private Integer itemid;

    /**
     * 返回值类型
     * 0: float  浮点型
     * 1: String 字符串
     */
    private Integer valueType;

    /**
     * 检查项说明
     */
    private String description;

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public Integer getValueType() {
        return valueType;
    }

    public void setValueType(Integer valueType) {
        this.valueType = valueType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
