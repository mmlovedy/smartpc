package com.smartpc.gathering.core.service;

import com.smartpc.gathering.core.common.config.ESConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: ElasticsearchService
 * @Package com.smartpc.gathering.core.service
 * @date 2017/5/5 下午6:02
 */
@Service
public class ElasticsearchService {
    @Autowired
    ESConfig constant;

    public String Test(){
        return constant.getElasticsearchUrl();
    }
}
