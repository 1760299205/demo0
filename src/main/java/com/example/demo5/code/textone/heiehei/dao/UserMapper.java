package com.example.demo5.code.textone.heiehei.dao;

import com.example.demo5.code.textone.heiehei.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author : JCccc
 * @CreateTime : 2019/10/23
 * @Description :
 **/
@Mapper
public
interface UserMapper {
   @Select("select * from user")
    List<User> queryUserInfo();
}
