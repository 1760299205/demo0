package com.example.demo5.code.textone.heiehei.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface Dao  {
    @Select("SELECT TABLE_NAME as tableName ,TABLE_COMMENT as tableComment FROM information_schema.TABLES WHERE table_schema='airdesign'")
    List<Map<String,String>> index();
}
