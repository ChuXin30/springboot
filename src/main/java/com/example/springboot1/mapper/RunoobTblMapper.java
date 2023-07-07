package com.example.springboot1.mapper;

import com.example.springboot1.po.RunoobTbl;

public interface RunoobTblMapper {
    int deleteByPrimaryKey(Integer runoobId);

    int insert(RunoobTbl record);

    int insertSelective(RunoobTbl record);

    RunoobTbl selectByPrimaryKey(Integer runoobId);

    int updateByPrimaryKeySelective(RunoobTbl record);

    int updateByPrimaryKey(RunoobTbl record);
}