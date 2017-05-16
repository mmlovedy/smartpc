package com.smartpc.gathering.core.service;

import com.smartpc.common.utils.ResponseEntity;
import com.smartpc.gathering.core.dto.DiagnosisDto;


/**
 * @author 刘德云
 * @version V1.0
 * @Title: PcInfoGatheringService
 * @Package com.smartpc.gathering.core.service
 * @Description: 用于保存采集的PC信息的 Service
 * @date 2017/5/9 上午11:37
 */
public interface DiagnosisService {
    /**
     * 保存收集上来的信息
     * @param diagnosisDto
     * @return
     */
    public ResponseEntity saveGatheringInfo(DiagnosisDto diagnosisDto);

}
