package com.smartpc.gathering.core.po;

import java.io.Serializable;
import java.util.List;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: NetWorkInfo
 * @Package com.smartpc.gathering.core.po
 * @Description: 网络相关信息
 * @date 2017/5/8 下午3:13
 */
public class NetWorkPo implements Serializable {

    /**
     * 外网 IP
     */
    private String  outIP;

    /**
     * 内网 IP
     */
    private String inIP;

    /**
     * 上传带宽
     */
    private float bandwidth_up;

    /**
     * 下载带宽
     */
    private float bandwidth_down;

    /**
     * IPv4 地址
     */
    private String ipAddress;

    /**
     * 网关地址
     */
    private String ipGate;

    /**
     * dns 服务器
     */
    private String dnsServer;

    /**
     * ping 的相关信息
     */
    private PingPo pingPo;

    /**
     * telnet 的相关信息
     */
    private TelnetPo telnetPo;

    /**
     * tracertPo 路由跟踪信息
     */
    private TracertPo tracertPo;

    /**
     * http get/post 访问某个地址的相关信息
     */
    private HttpAccessPo httpAccessPo;

    /**
     * 用户自定义脚本执行相关信息
     */
    private List<CustomerBatPo> customerBatPos;

    public String getOutIP() {
        return outIP;
    }

    public void setOutIP(String outIP) {
        this.outIP = outIP;
    }

    public String getInIP() {
        return inIP;
    }

    public void setInIP(String inIP) {
        this.inIP = inIP;
    }

    public float getBandwidth_up() {
        return bandwidth_up;
    }

    public void setBandwidth_up(float bandwidth_up) {
        this.bandwidth_up = bandwidth_up;
    }

    public float getBandwidth_down() {
        return bandwidth_down;
    }

    public void setBandwidth_down(float bandwidth_down) {
        this.bandwidth_down = bandwidth_down;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getIpGate() {
        return ipGate;
    }

    public void setIpGate(String ipGate) {
        this.ipGate = ipGate;
    }

    public String getDnsServer() {
        return dnsServer;
    }

    public void setDnsServer(String dnsServer) {
        this.dnsServer = dnsServer;
    }

    public PingPo getPingPo() {
        return pingPo;
    }

    public void setPingPo(PingPo pingPo) {
        this.pingPo = pingPo;
    }

    public TelnetPo getTelnetPo() {
        return telnetPo;
    }

    public void setTelnetPo(TelnetPo telnetPo) {
        this.telnetPo = telnetPo;
    }

    public TracertPo getTracertPo() {
        return tracertPo;
    }

    public void setTracertPo(TracertPo tracertPo) {
        this.tracertPo = tracertPo;
    }

    public HttpAccessPo getHttpAccessPo() {
        return httpAccessPo;
    }

    public void setHttpAccessPo(HttpAccessPo httpAccessPo) {
        this.httpAccessPo = httpAccessPo;
    }

    public List<CustomerBatPo> getCustomerBatPos() {
        return customerBatPos;
    }

    public void setCustomerBatPos(List<CustomerBatPo> customerBatPos) {
        this.customerBatPos = customerBatPos;
    }
}
