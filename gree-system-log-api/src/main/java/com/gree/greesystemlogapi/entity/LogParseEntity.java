package com.gree.greesystemlogapi.entity;

public class LogParseEntity {

    private int id;

    //服务器日志时间
    private String svrTime;
    //服务器日志输出的级别
    private String logLevel;
    //服务器类型
    private String svrType;

    //服务器的IP地址
    private String svrIP;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSvrTime() {
        return svrTime;
    }

    public void setSvrTime(String svrTime) {
        this.svrTime = svrTime;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public String getSvrType() {
        return svrType;
    }

    public void setSvrType(String svrType) {
        this.svrType = svrType;
    }

    public String getSvrIP() {
        return svrIP;
    }

    public void setSvrIP(String svrIP) {
        this.svrIP = svrIP;
    }
}
