package com.smartpc.gathering.core;

import com.alibaba.fastjson.JSON;
import com.smartpc.gathering.core.service.ItemsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @author 刘德云
 * @version V1.0
 * @Title: Test
 * @Package PACKAGE_NAME
 * @date 2017/5/9 下午1:54
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMain {

/*
    @Autowired
    DiagnosisService diagnosisService;
*/
/*
    @Test
    public void test(){
        DiagnosisDto diagnosisDto  = new DiagnosisDto();
        User userPo = new User();
        userPo.setUserCode("12121212");
        userPo.setMobile("123456789");
        PcBasePo pcBasePo = new PcBasePo();
        pcBasePo.setPhysicalMemory("8g");
        //pcBasePo.setCpuUsageRate("0.5");
        pcBasePo.setUserPo(userPo);
        diagnosisDto.setPcBasePo(pcBasePo);

        diagnosisService.saveGatheringInfo(diagnosisDto);
    }*/
    @Autowired
    ItemsService itemsService;
    @Test
    public void itemtest(){
        System.out.println(JSON.toJSONString(itemsService.queryAll()));
    }




}
