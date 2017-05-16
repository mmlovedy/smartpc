package com.smartpc.common.utils;

import java.io.Serializable;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: ResponseEntity
 * @Package com.smartpc.common.utils
 * @date 2017/5/9 下午2:53
 */
public class ResponseEntity implements Serializable{

    private String responseStatus ;

    private String erroMessage;

    public String getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getErroMessage() {
        return erroMessage;
    }

    public void setErroMessage(String erroMessage) {
        this.erroMessage = erroMessage;
    }
}
