package com.smartpc.gathering.core.dto;

import com.smartpc.gathering.core.po.MonitorPo;
import com.smartpc.gathering.core.po.NetWorkPo;
import com.smartpc.gathering.core.po.PcBasePo;

import java.io.Serializable;
import java.util.List;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: DiagnosisDto
 * @Package com.smartpc.gathering.core.dto
 * @Description: 诊断信息收集
 * @date 2017/5/9 上午11:44
 */
public class DiagnosisDto implements Serializable {


    /**
     * 电脑基础信息
     */
    private PcBasePo pcBasePo;

    /**
     * 网络信息
     */
    private NetWorkPo netWorkPo;

    /**
     * 自定义监控信息
     */
    private List<MonitorPo> floatMonitorList;

    public PcBasePo getPcBasePo() {
        return pcBasePo;
    }

    public void setPcBasePo(PcBasePo pcBasePo) {
        this.pcBasePo = pcBasePo;
    }

    public NetWorkPo getNetWorkPo() {
        return netWorkPo;
    }

    public void setNetWorkPo(NetWorkPo netWorkPo) {
        this.netWorkPo = netWorkPo;
    }

    public List<MonitorPo> getFloatMonitorList() {
        return floatMonitorList;
    }

    public void setFloatMonitorList(List<MonitorPo> floatMonitorList) {
        this.floatMonitorList = floatMonitorList;
    }
}
