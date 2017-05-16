package com.smartpc.gathering.core.po;

import java.io.Serializable;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: CustomerBatPo
 * @Package com.smartpc.gathering.core.po
 * @Description: 用户自定义脚本执行结果
 * @date 2017/5/8 下午4:13
 */
public class CustomerBatPo implements Serializable {

    /**
     * 脚本在服务器的路径
     */
    private String batUrl;

    /**
     * 脚本名称
     */
    private String batName ;

    /**
     * 内容
     */
    private String content;

    /**
     * 执行是否成功
     */
    private boolean isSuccess;

    /**
     * 执行结果
     */
    private String result;

    public String getBatUrl() {
        return batUrl;
    }

    public void setBatUrl(String batUrl) {
        this.batUrl = batUrl;
    }

    public String getBatName() {
        return batName;
    }

    public void setBatName(String batName) {
        this.batName = batName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
