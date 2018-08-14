package com.gree.greesystemlogapi.service;

import com.gree.greesystemlogapi.entity.LogParseEntity;
import com.gree.greesystemlogapi.model.LogParseModel;

import java.util.List;

public interface ILogParseService {

    List<LogParseEntity> getSystemLogList( LogParseModel logParseEntity);
}
