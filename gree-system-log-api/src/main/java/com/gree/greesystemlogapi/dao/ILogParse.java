package com.gree.greesystemlogapi.dao;

import com.gree.greesystemlogapi.entity.LogParseEntity;
import com.gree.greesystemlogapi.model.LogParseModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ILogParse {

    /**
     * 根据条件查询数据
     *
     * @param logParseModel
     * @return 实体数据
     */
  /*  @Select("SELECT * FROM logparse WHERE logLevel = #{logParseEntity.logLevel}  and   svrType = #{logParseEntity.svrType}  and svrIP = #{logParseEntity.svrIP}")
    @ResultType(LogParseEntity.class)*/
    List<LogParseEntity> selectLogParseList( LogParseModel logParseModel);
}
