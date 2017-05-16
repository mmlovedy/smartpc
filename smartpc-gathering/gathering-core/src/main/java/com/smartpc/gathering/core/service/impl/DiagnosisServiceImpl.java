package com.smartpc.gathering.core.service.impl;

import com.alibaba.fastjson.JSON;
import com.smartpc.common.utils.HttpUtils;
import com.smartpc.common.utils.ResponseEntity;
import com.smartpc.common.utils.ResponseStatus;
import com.smartpc.gathering.core.dto.DiagnosisDto;
import com.smartpc.gathering.core.service.DiagnosisService;
import com.smartpc.gathering.core.common.config.ESConfig;
import com.smartpc.gathering.core.utils.ESConstant;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: DiagnosisServiceImpl
 * @Package com.smartpc.gathering.core.service.impl
 * @date 2017/5/9 下午12:40
 */
@Service
public class DiagnosisServiceImpl implements DiagnosisService {

    private static final Logger log = LogManager.getLogger(DiagnosisServiceImpl.class);

    private RestTemplate restTemplate = HttpUtils.getHttpTemplet();

    private HttpHeaders headers = HttpUtils.getHeaders();
    @Autowired
    private ESConfig esConfig;

    public ResponseEntity saveGatheringInfo(DiagnosisDto diagnosisDto) {
        ResponseEntity response = new ResponseEntity();
        if(diagnosisDto.getPcBasePo() == null || diagnosisDto.getPcBasePo().getMac() == null){
                response.setResponseStatus(ResponseStatus.RESPONSE_FAILED);
                response.setErroMessage("pcinfo & MAC_ADDRESS can't be empty");
                return response;
        }
        String url = esConfig.getElasticsearchUrl() + ESConstant.GATHERING_IDX + ESConstant.GATHERING_PCNETWORK_TYPE
                        + "/" +diagnosisDto.getPcBasePo().getMac();
        String json = JSON.toJSONString(diagnosisDto);
        log.info(">>>>>>>>>>>>>>>>>>>>>>requestUrl:"+url);
        log.info(">>>>>>>>>>>>>>>>>>>>>>jsonObject:"+json);
        try{
            restTemplate.postForObject(url,new HttpEntity<String>(json,headers),
                    String.class);
        }catch (Exception e){
            response.setResponseStatus(ResponseStatus.RESPONSE_FAILED);
            response.setErroMessage(e.getMessage());
            return response;
        }
        response.setResponseStatus(ResponseStatus.RESPONSE_SUCCESS);
        return response;
    }

}
