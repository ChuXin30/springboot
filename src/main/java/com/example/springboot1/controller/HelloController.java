package com.example.springboot1.controller;


import com.example.springboot1.mapper.RunoobTblMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    RunoobTblMapper runoobTblMapper;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/testMysql")
    public String testMysql() {

        runoobTblMapper.selectByPrimaryKey(1);
        return "Hello World";
    }

}