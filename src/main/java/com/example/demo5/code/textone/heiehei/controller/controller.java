package com.example.demo5.code.textone.heiehei.controller;

import com.alibaba.druid.pool.DruidDataSource;
import com.example.demo5.code.textone.config.DynamicDataSource;
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
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl("spring.datasource.url=jdbc:mysql://10.70.23.20:3306/airDesign?useUnicode=true&characterEncoding=utf-8");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("Root@123456");
        DynamicDataSource.dataSourcesMap.put("airDesign", druidDataSource);
        DynamicDataSource.setDataSource("airDesign");
//        此时数据源已切换到druidDataSource ，调用自己的业务方法即可。
//        使用完后调用DynamicDataSource.clear();重置为默认数据源。
        return sercice.index().toString();
    }
}
