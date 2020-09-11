package com.example.demo5.code.textone.heiehei.controller;

import com.example.demo5.code.textone.heiehei.service.sercice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @Autowired
    private sercice sercice;



    @RequestMapping("index")
    public String index (){
//        此时数据源已切换到druidDataSource ，调用自己的业务方法即可。
//        使用完后调用DynamicDataSource.clear();重置为默认数据源。
        return sercice.index().toString();
    }
}
