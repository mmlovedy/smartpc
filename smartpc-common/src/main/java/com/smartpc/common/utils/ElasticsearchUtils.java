package com.smartpc.common.utils;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: ElasticsearchUtils
 * @Package com.smartpc.common.utils
 * @Description: elasticsearch工具类
 * @date 2017/5/8 下午5:07
 */
public class ElasticsearchUtils {

    @Value("${elasticsearch.httpNodes}")
    private String httpNodes;
    @Value("${elasticsearch.clusterNodes}")
    private String clusterNodes;
    @Value("${elasticsearch.clusterName}")
    private String clusterName;
    @Value("${elasticsearch.clientPingTimeout}")
    private String clientPingTimeout;
    @Value("${elasticsearch.clientNodesSamplerInterval}")
    private String clientNodesSamplerInterval;


}
