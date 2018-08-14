package com.gree.greesystemlogapi.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.gree.greesystemlogapi.entity.LogParseEntity;
import com.gree.greesystemlogapi.model.LogParseModel;
import com.gree.greesystemlogapi.service.ILogParseService;
import com.gree.greesystemlogapi.utils.PageBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class SystemLogController {

    @Autowired
    private ILogParseService logParseService;

    @GetMapping("/systemLog/list")
    public String getSystemLogList(LogParseModel logParseEntity, Integer currentPage, Integer pageSize) {


        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        PageHelper.startPage(currentPage, pageSize);
        List<LogParseEntity> list = logParseService.getSystemLogList(logParseEntity);
      //  List<LogParseEntity> allItems = logParseService.findAll();        //全部商品
        int countNums = list.size();            //总记录数
        PageBean<LogParseEntity> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(list);
        String resultList = JSONObject.toJSON(pageData).toString();
        log.info("resultList " +resultList);
        log.info("list size " + list.size());
        return resultList;
    }

}
