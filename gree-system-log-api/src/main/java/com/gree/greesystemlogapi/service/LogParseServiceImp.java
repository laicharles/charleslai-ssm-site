package com.gree.greesystemlogapi.service;

import com.gree.greesystemlogapi.dao.ILogParse;
import com.gree.greesystemlogapi.entity.LogParseEntity;
import com.gree.greesystemlogapi.model.LogParseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LogParseServiceImp implements ILogParseService {

    @Autowired
    private ILogParse iLogParse;

    @Override
    public List<LogParseEntity> getSystemLogList( LogParseModel logParseModel) {
        return iLogParse.selectLogParseList(logParseModel);
    }
}
