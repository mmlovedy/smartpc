package com.smartpc.gathering.core.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: Constant
 * @Package com.smartpc.gathering.core.utils
 * @date 2017/5/5 下午5:19
 */
@Component
public class ESConfig {
    @Value("${esconfig.elasticsearchUrl}")
    private String elasticsearchUrl;

    public String getElasticsearchUrl() {
        return elasticsearchUrl;
    }

    public void setElasticsearchUrl(String elasticsearchUrl) {
        this.elasticsearchUrl = elasticsearchUrl;
    }
}
