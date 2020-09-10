package com.example.demo5.code.textone.heiehei.service;

import com.example.demo5.code.textone.heiehei.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class sercice {
    @Autowired
    Dao dao;

    public List<Map<String,String>>  index (){
        return dao.index();
    }
}
