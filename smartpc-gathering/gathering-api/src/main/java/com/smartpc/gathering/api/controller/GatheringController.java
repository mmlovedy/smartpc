package com.smartpc.gathering.api.controller;

import com.smartpc.common.utils.ResponseEntity;
import com.smartpc.gathering.core.dto.DiagnosisDto;
import com.smartpc.gathering.core.po.ItemPo;
import com.smartpc.gathering.core.service.DiagnosisService;
import com.smartpc.gathering.core.service.ElasticsearchService;
import com.smartpc.gathering.core.service.ItemsService;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: GatheringController
 * @Package com.smartpc.gathering.api.controller
 * @date 2017/5/4 下午3:52
 */
@RequestMapping("/api")
@RestController
public class GatheringController {
    @Autowired
    ElasticsearchService service;

    @RequestMapping("/")
    public String test(){
        return service.Test();
    }

    @Autowired
    DiagnosisService diagnosisService;
    @Autowired
    ItemsService itemsService;

    @RequestMapping(value="/v1/gatheringAll",method= RequestMethod.POST)
    public ResponseEntity gatheringPcInfo(@RequestBody DiagnosisDto diagnosisDto){
       return diagnosisService.saveGatheringInfo(diagnosisDto);
    }

    @RequestMapping(value = "/v1/queryItems",method = RequestMethod.GET)
    public List<ItemPo> queryItems(){
        return itemsService.queryAll();
    }

}
