package com.gree.greesystemlogapi.model;

import com.gree.greesystemlogapi.entity.LogParseEntity;

public class LogParseModel  extends LogParseEntity {
    private  String  firstSvrTime;
    private  String  endSvrTime;

    public String getFirstSvrTime() {
        return firstSvrTime;
    }

    public void setFirstSvrTime(String firstSvrTime) {
        this.firstSvrTime = firstSvrTime;
    }

    public String getEndSvrTime() {
        return endSvrTime;
    }

    public void setEndSvrTime(String endSvrTime) {
        this.endSvrTime = endSvrTime;
    }
}
